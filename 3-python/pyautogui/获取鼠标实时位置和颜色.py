import pyautogui
import time

try:
    while True:
        x,y = pyautogui.position()
        rgb = pyautogui.screenshot().getpixel((x,y))
        posi = 'x:' + str(x).rjust(4) + ' y:' + str(y).rjust(4) + '  RGB:' + str(rgb)
        print('\r',posi,end='')
        time.sleep(0.5)

except KeyboardInterrupt:
    print('已退出！')
