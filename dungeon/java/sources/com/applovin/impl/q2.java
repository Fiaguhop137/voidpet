package com.applovin.impl;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class q2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) obj).compareToIgnoreCase((String) obj2);
    }
}
