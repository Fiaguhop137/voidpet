package com.rivereactnative;

import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends com.android.volley.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.android.volley.p.b f38738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String url, com.android.volley.p.b listener, com.android.volley.p.a errorListener) {
        super(0, url, errorListener);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(errorListener, "errorListener");
        this.f38738a = listener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.n
    public void deliverResponse(byte[] response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f38738a.a(response);
    }

    @Override // com.android.volley.n
    protected com.android.volley.p parseNetworkResponse(com.android.volley.k kVar) {
        byte[] bArr;
        if (kVar != null) {
            try {
                bArr = kVar.f27880b;
                if (bArr == null) {
                    bArr = new byte[0];
                }
            } catch (UnsupportedEncodingException e10) {
                com.android.volley.p pVarA = com.android.volley.p.a(new com.android.volley.m(e10));
                Intrinsics.c(pVarA);
                return pVarA;
            }
        } else {
            bArr = new byte[0];
        }
        com.android.volley.p pVarC = com.android.volley.p.c(bArr, p166j4.e.e(kVar));
        Intrinsics.c(pVarC);
        return pVarC;
    }
}
