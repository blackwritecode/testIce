// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `myservice.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.ls.demo.demo;

public interface MyServicePrx extends Ice.ObjectPrx
{
    public String hello();

    public String hello(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_hello();

    public Ice.AsyncResult begin_hello(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_hello(Ice.Callback __cb);

    public Ice.AsyncResult begin_hello(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_hello(Callback_MyService_hello __cb);

    public Ice.AsyncResult begin_hello(java.util.Map<String, String> __ctx, Callback_MyService_hello __cb);

    public String end_hello(Ice.AsyncResult __result);
}
