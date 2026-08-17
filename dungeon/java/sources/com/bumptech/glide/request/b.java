package com.bumptech.glide.request;

import H4.c;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f28691a;

        a(boolean z10) {
            this.f28691a = z10;
        }

        boolean g() {
            return this.f28691a;
        }
    }

    boolean canNotifyCleared(c cVar);

    boolean canNotifyStatusChanged(c cVar);

    boolean canSetImage(c cVar);

    b getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(c cVar);

    void onRequestSuccess(c cVar);
}
