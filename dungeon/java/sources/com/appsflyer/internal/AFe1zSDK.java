package com.appsflyer.internal;

import androidx.annotation.NonNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public interface AFe1zSDK<ResponseType> {
    @NonNull
    ResponseType getRevenue(String str) throws JSONException;
}
