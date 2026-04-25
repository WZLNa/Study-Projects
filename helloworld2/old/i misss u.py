import tkinter as tk
import threading
import random
from pynput import keyboard

windows = []
stop_flag = False
MAX_WINDOWS = 150
root_main = tk.Tk()
root_main.withdraw()


def create_popup():
    global stop_flag, windows
    if stop_flag:
        return

    # 弹窗基础设置（320x170，粉色背景）
    win = tk.Toplevel(root_main)
    win.title("I miss u")
    win.geometry("320x170")
    win.config(bg="#FFC0CB")  # 标准粉色，避免色值差异
    win.attributes("-topmost", True)

    # 随机位置
    screen_w = root_main.winfo_screenwidth()
    screen_h = root_main.winfo_screenheight()
    x = random.randint(0, screen_w - 320)
    y = random.randint(0, screen_h - 170)
    win.geometry(f"320x170+{x}+{y}")

    # 关键优化：去掉边框+解决字体发虚
    label = tk.Label(
        win,
        text="我想你了",
        # 用系统高清字体（Windows默认有微软雅黑，渲染比Arial清晰，避免发虚）
        font=("微软雅黑", 24, "bold"),
        fg="black",  # 纯黑文字，对比度高更清晰
        bg="#FFC0CB",  # 与弹窗背景一致，无割裂感
        # 移除之前的边框参数（bd=1和relief="solid"），彻底去掉边框
    )
    # 强制居中，避免布局挤压导致的显示问题
    label.place(x=160, y=85, anchor="center")

    # 数量控制
    windows.append(win)
    if len(windows) > MAX_WINDOWS:
        old_win = windows.pop(0)
        old_win.destroy()


def popup_thread():
    while not stop_flag:
        thread = threading.Thread(target=create_popup, daemon=True)
        thread.start()
        threading.Event().wait(0.1)


def on_key_press(key):
    global stop_flag
    stop_flag = True
    for win in windows:
        win.destroy()
    windows.clear()
    root_main.quit()
    return False


if __name__ == "__main__":
    key_listener = keyboard.Listener(on_press=on_key_press)
    key_listener.start()
    threading.Thread(target=popup_thread, daemon=True).start()
    root_main.mainloop()