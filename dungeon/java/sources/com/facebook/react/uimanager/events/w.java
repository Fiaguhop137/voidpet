package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f30487a = new SparseIntArray();

    public final void a(long j10) {
        this.f30487a.put((int) j10, 0);
    }

    public final short b(long j10) {
        int i10 = this.f30487a.get((int) j10, -1);
        if (i10 != -1) {
            return (short) (i10 & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public final boolean c(long j10) {
        return this.f30487a.get((int) j10, -1) != -1;
    }

    public final void d(long j10) {
        int i10 = (int) j10;
        int i11 = this.f30487a.get(i10, -1);
        if (i11 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.f30487a.put(i10, i11 + 1);
    }

    public final void e(long j10) {
        this.f30487a.delete((int) j10);
    }
}
