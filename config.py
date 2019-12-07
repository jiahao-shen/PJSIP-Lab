"""
@project: PJSIP-Lab
@author: sam
@file config.py
@ide: Visual Studio Code
@time: 2019-11-25 11:36:37
@blog: https://jiahaoplus.com
"""
from enum import Enum

# SIP Configuration
DEFAULT_DOMAIN = '27.102.107.237'


# GUI Configuration
TITLE = ('Arial', 20, 'bold')
CONTENT = ('Arial', 15, 'normal')

class State(Enum):
    CALLING = 'Calling...'
    CONNECT = 'Connect'
    DISCONNECT = 'Disconnect'
    HOLD = 'Holding...'
