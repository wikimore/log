/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wikimore.mlog.impl;

import com.wikimore.mlog.Log;

/**
 * Log implementation wrapper Logback log
 * 
 * @author ted created at 2013-5-19
 * @version 1.0
 */
public class LogbackLog implements Log {

    @Override
    public boolean isDebugEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isErrorEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isFatalEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isInfoEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isTraceEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isWarnEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void trace(String message) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void trace(String message, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void trace(String message, Throwable t, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void trace(String message, Throwable t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void debug(String message) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void debug(String message, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void debug(String message, Throwable t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void debug(String message, Throwable t, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void info(String message) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void info(String message, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void info(String message, Throwable t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void info(String message, Throwable t, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void warn(String message) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void warn(String message, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void warn(String message, Throwable t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void warn(String message, Throwable t, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void error(String message) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void error(String message, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void error(String message, Throwable t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void error(String message, Throwable t, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fatal(String message) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fatal(String message, Object... params) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fatal(String message, Throwable t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fatal(String message, Throwable t, Object... params) {
        // TODO Auto-generated method stub
        
    }

}
