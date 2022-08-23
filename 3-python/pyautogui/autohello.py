#!/usr/bin/python
# -*- coding: UTF-8 -*- 
import pyautogui

if __name__ == "__main__":  # 用作主程序时执行
    print ('This is main of module')
    sizex,sizey=pyautogui.size()
    pyautogui.moveTo(sizex/2,sizey/2,duration=1)
    pyautogui.moveRel(100, -200, duration=0.5)


    