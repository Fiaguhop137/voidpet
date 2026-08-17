package com.android.billingclient.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.android.billingclient.api.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2138k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.K f27779a;

    /* JADX INFO: renamed from: com.android.billingclient.api.k$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.play_billing.K f27780a;

        /* synthetic */ a(p131h4.T t10) {
        }

        public C2138k a() {
            if (this.f27780a != null) {
                return new C2138k(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f27780a = com.google.android.gms.internal.play_billing.K.l(list);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.k$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27782b;

        /* JADX INFO: renamed from: com.android.billingclient.api.k$b$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f27783a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f27784b;

            /* synthetic */ a(p131h4.T t10) {
            }

            public b a() {
                String str = this.f27784b;
                if ("first_party".equals(str)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f27783a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (str != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f27783a = str;
                return this;
            }

            public a c(String str) {
                this.f27784b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, p131h4.T t10) {
            this.f27781a = aVar.f27783a;
            this.f27782b = aVar.f27784b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f27781a;
        }

        public final String c() {
            return this.f27782b;
        }
    }

    /* synthetic */ C2138k(a aVar, p131h4.T t10) {
        this.f27779a = aVar.f27780a;
    }

    public static a a() {
        return new a(null);
    }

    public final com.google.android.gms.internal.play_billing.K b() {
        return this.f27779a;
    }

    public final String c() {
        return ((b) this.f27779a.get(0)).c();
    }
}
