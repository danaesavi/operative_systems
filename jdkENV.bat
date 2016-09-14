@echo off
set jdkpath=C:\Program Files\Java\jdk1.8.0_45\bin
title %jdkpath%
set path=%jdkpath%;%path%
set CLASSPATH=.
hostname
cmd
@echo on
