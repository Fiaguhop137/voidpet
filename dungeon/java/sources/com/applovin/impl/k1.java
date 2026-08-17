package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpannedString f28090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpannedString f28091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28092e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28093f = 0;

    public k1(int i10) {
        this.f28088a = i10;
    }

    public final k1 a(Context context) {
        this.f28092e = R.drawable.axon_ic_disclosure_arrow;
        this.f28093f = context.getColor(R.color.axon_sdk_disclosureButtonColor);
        return this;
    }

    public final k1 a(String str) {
        this.f28090c = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
        return this;
    }
}
