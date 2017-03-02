/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.cloudkit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKQueryNotification/*</name>*/ 
    extends /*<extends>*/CKNotification/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKQueryNotificationPtr extends Ptr<CKQueryNotification, CKQueryNotificationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKQueryNotification.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKQueryNotification() {}
    protected CKQueryNotification(Handle h, long handle) { super(h, handle); }
    protected CKQueryNotification(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "queryNotificationReason")
    public native CKQueryNotificationReason getQueryNotificationReason();
    @Property(selector = "recordFields")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringMapMarshaler.class) Map<String, NSObject> getRecordFields();
    @Property(selector = "recordID")
    public native CKRecordID getRecordID();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "isPublicDatabase")
    public native boolean isPublicDatabase();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "databaseScope")
    public native CKDatabaseScope getDatabaseScope();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
