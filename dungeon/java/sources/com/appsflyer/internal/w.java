package com.appsflyer.internal;

import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFj1tSDK f28524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFf1xSDK f28525b;

    public /* synthetic */ w(AFj1tSDK aFj1tSDK, AFf1xSDK aFf1xSDK) {
        this.f28524a = aFj1tSDK;
        this.f28525b = aFf1xSDK;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        AFf1xSDK.getRevenue(this.f28524a, this.f28525b, observable, obj);
    }
}
