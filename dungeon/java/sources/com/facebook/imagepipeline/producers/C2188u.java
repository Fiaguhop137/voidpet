package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2188u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2188u f29260a = new C2188u();

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private C2188u() {
    }

    public static final U5.j a(p133h6.b imageRequest, U5.j jVar, U5.j jVar2, Map map) {
        String strF;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (imageRequest.c() == p133h6.b.EnumC0495b.SMALL) {
            return jVar;
        }
        if (imageRequest.c() == p133h6.b.EnumC0495b.DEFAULT) {
            return jVar2;
        }
        if (imageRequest.c() != p133h6.b.EnumC0495b.DYNAMIC || map == null || (strF = imageRequest.f()) == null) {
            return null;
        }
        return (U5.j) map.get(strF);
    }
}
