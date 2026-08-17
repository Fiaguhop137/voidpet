package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements p199l1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f27938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f27940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f27942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e3 f27943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f27944h;

    public b0(d0 d0Var, String str, g1 g1Var, String str2, JSONObject jSONObject, boolean z10, a0 a0Var, e3 e3Var) {
        this.f27944h = d0Var;
        this.f27937a = str;
        this.f27938b = g1Var;
        this.f27939c = str2;
        this.f27940d = jSONObject;
        this.f27941e = z10;
        this.f27942f = a0Var;
        this.f27943g = e3Var;
    }

    @Override // p199l1.b
    public final void accept(Object obj) {
        MalformedURLException malformedURLException;
        int i10;
        u1 u1Var = (u1) obj;
        long j10 = u1Var.f28371d;
        Object objA = null;
        try {
            try {
                Throwable th = u1Var.f28372e;
                if (th != null) {
                    throw th;
                }
                i10 = u1Var.f28368a;
                try {
                    if (i10 <= 0) {
                        this.f27944h.a(this.f27939c, this.f27937a, i10, j10, (Throwable) null);
                        this.f27943g.a(this.f27937a, i10, null, null);
                        return;
                    }
                    if (i10 < 200 || i10 >= 400) {
                        this.f27943g.a(this.f27937a, i10, null, null);
                        return;
                    }
                    d0.a(this.f27944h, this.f27939c, this.f27937a, i10, j10);
                    Throwable th2 = u1Var.f28372e;
                    if (th2 != null) {
                        throw th2;
                    }
                    byte[] bArr = u1Var.f28369b;
                    if (bArr == null) {
                        this.f27943g.a(this.f27937a, this.f27940d, i10);
                        return;
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    String str = new String(bArr, Charset.forName("UTF-8"));
                    if (this.f27942f != null && this.f27938b.f28044p) {
                        d0 d0Var = this.f27944h;
                        System.currentTimeMillis();
                        d0Var.getClass();
                    }
                    if (this.f27941e) {
                        str = this.f27944h.f27970a.j().b(this.f27944h.f27970a.f28258a, bArr);
                    }
                    try {
                        this.f27943g.a(this.f27937a, d0.a(this.f27944h, str, this.f27940d), i10);
                    } catch (Throwable th3) {
                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f27937a) + " because of " + th3.getClass().getName() + " : " + th3.getMessage();
                        p1 p1Var = this.f27944h.f27971b;
                        if (p1.f28289b) {
                            p1Var.a("ConnectionManager", str2, th3);
                        }
                        this.f27943g.a(this.f27937a, -800, str2, null);
                    }
                } catch (MalformedURLException e10) {
                    malformedURLException = e10;
                    if (this.f27940d != null) {
                        this.f27944h.a(this.f27939c, this.f27937a, i10, j10, malformedURLException);
                        this.f27943g.a(this.f27937a, -901, malformedURLException.getMessage(), null);
                    } else {
                        d0.a(this.f27944h, this.f27939c, this.f27937a, i10, j10);
                        this.f27943g.a(this.f27937a, this.f27940d, -901);
                    }
                }
            } catch (MalformedURLException e11) {
                malformedURLException = e11;
                i10 = 0;
            }
        } catch (Throwable th4) {
            int i11 = u1Var.f28368a;
            try {
                byte[] bArr2 = u1Var.f28370c;
                String str3 = new String(bArr2);
                if (bArr2 != null) {
                    if (this.f27941e) {
                        str3 = this.f27944h.f27970a.j().b(this.f27944h.f27970a.f28258a, bArr2);
                    }
                    objA = d0.a(this.f27944h, str3, this.f27940d);
                }
            } catch (Throwable unused) {
            }
            this.f27944h.a(this.f27939c, this.f27937a, i11, j10, th4);
            this.f27943g.a(this.f27937a, i11, th4.getMessage(), objA);
        }
    }
}
