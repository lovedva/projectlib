#!/usr/bin/python
# -*- coding: UTF-8 -*- 
from time import sleep
from pywinauto.application import Application
from pywinauto import Desktop

if __name__=="__main__":
    # 对于Windows中自带应用程序，直接执行，对于外部应用应输入完整路径
    # app = Application(backend="uia").start('notepad.exe')     
    app = Application(backend="uia").start("D:\Program Files (x86)\CAXA2022\Bin64\CDRAFT_M.exe",timeout=10)
    app.print_control_identifiers()
    # actionable_dlg = dlg_spec.wait('visible')