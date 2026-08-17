package com.facebook.react.views.text;

import com.facebook.react.uimanager.W;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends W {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f31024y;

    @Override // com.facebook.react.uimanager.W, com.facebook.react.uimanager.V
    public boolean P() {
        return true;
    }

    @Y6.a(name = "text")
    public final void setText(@Nullable String str) {
        this.f31024y = str;
        x0();
    }

    @Override // com.facebook.react.uimanager.W
    public String toString() {
        return v() + " [text: " + this.f31024y + "]";
    }

    public final String u1() {
        return this.f31024y;
    }
}
