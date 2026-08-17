package com.github.penfeizhou.animation.glide;

import D4.e;
import java.io.IOException;
import p274p4.h;
import p310r4.v;
import p328s4.d;
import p436y4.f;

/* JADX INFO: loaded from: classes2.dex */
class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f31555a;

    a(d dVar) {
        this.f31555a = dVar;
    }

    @Override // D4.e
    public v a(v vVar, h hVar) {
        try {
            return f.d(((com.github.penfeizhou.animation.decode.b) vVar.get()).v(0), this.f31555a);
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
