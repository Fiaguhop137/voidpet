package com.applovin.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static h f28050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28051c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28052a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public h(Context context) {
        ?? eventType = 0;
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                this.f28052a = applicationInfo.processName;
            } catch (PackageManager.NameNotFoundException e10) {
                p1.c("AndroidManifest", "Failed to get meta data.", e10);
                this.f28052a = null;
            }
            try {
                XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
                eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
                do {
                    if (2 == eventType && xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                        for (int i10 = 0; i10 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i10++) {
                            String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i10);
                            String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10);
                            if (attributeName.equals("networkSecurityConfig")) {
                                Integer.valueOf(attributeValue.substring(1)).getClass();
                            } else if (attributeName.equals("usesCleartextTraffic")) {
                                Boolean.valueOf(attributeValue).getClass();
                            }
                        }
                    }
                    eventType = xmlResourceParserOpenXmlResourceParser.next();
                } while (eventType != 1);
            } catch (Throwable th) {
                p1.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
            }
        } catch (Throwable th2) {
            this.f28052a = eventType;
            throw th2;
        }
    }
}
