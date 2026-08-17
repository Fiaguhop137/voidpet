package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f27845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f27846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f27847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f27848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f27849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f27850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map f27851g = Collections.EMPTY_MAP;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f27852h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        boolean b(long j10) {
            return this.f27849e < j10;
        }

        boolean c(long j10) {
            return this.f27850f < j10;
        }
    }

    a a(String str);

    void b(String str, boolean z10);

    void c(String str, a aVar);

    void initialize();
}
