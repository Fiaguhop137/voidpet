package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC2895x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p131h4.AbstractC3458n;

/* JADX INFO: renamed from: com.android.billingclient.api.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2132e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f27682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.K f27683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f27684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27685g;

    /* JADX INFO: renamed from: com.android.billingclient.api.e$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f27688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList f27689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f27690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c.a f27691f;

        /* synthetic */ a(p131h4.H h10) {
            c.a aVarA = c.a();
            c.a.e(aVarA);
            this.f27691f = aVarA;
        }

        public C2132e a() {
            ArrayList arrayList = this.f27689d;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f27688c;
            boolean z11 = (list == null || list.isEmpty()) ? false : true;
            if (!z10 && !z11) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z10 && z11) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (!z10) {
                List list2 = this.f27688c;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((b) it.next()) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                }
            } else {
                if (this.f27689d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f27689d.size() > 1) {
                    android.support.v4.media.session.b.a(this.f27689d.get(0));
                    throw null;
                }
            }
            C2132e c2132e = new C2132e(null);
            if (z10) {
                android.support.v4.media.session.b.a(this.f27689d.get(0));
                throw null;
            }
            c2132e.f27679a = z11 && !((b) this.f27688c.get(0)).c().i().isEmpty();
            c2132e.f27680b = this.f27686a;
            c2132e.f27681c = this.f27687b;
            c2132e.f27682d = this.f27691f.a();
            ArrayList arrayList2 = this.f27689d;
            c2132e.f27684f = arrayList2 != null ? new ArrayList(arrayList2) : new ArrayList();
            c2132e.f27685g = this.f27690e;
            List list3 = this.f27688c;
            c2132e.f27683e = list3 != null ? com.google.android.gms.internal.play_billing.K.l(list3) : com.google.android.gms.internal.play_billing.K.n();
            c2132e.getClass();
            return c2132e;
        }

        public a b(boolean z10) {
            this.f27690e = z10;
            return this;
        }

        public a c(String str) {
            this.f27686a = str;
            return this;
        }

        public a d(String str) {
            this.f27687b = str;
            return this;
        }

        public a e(List list) {
            this.f27688c = new ArrayList(list);
            return this;
        }

        public a f(c cVar) {
            this.f27691f = c.c(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C2137j f27692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27693b;

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private C2137j f27694a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f27695b;

            /* synthetic */ a(p131h4.H h10) {
            }

            static /* bridge */ /* synthetic */ C0357b d(a aVar) {
                aVar.getClass();
                return null;
            }

            public b a() {
                AbstractC2895x.c(this.f27694a, "ProductDetails is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            public a b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f27695b = str;
                return this;
            }

            public a c(C2137j c2137j) {
                this.f27694a = c2137j;
                if (c2137j.c() != null) {
                    c2137j.c().getClass();
                    C2137j.b bVarC = c2137j.c();
                    if (bVarC.g() != null) {
                        this.f27695b = bVarC.g();
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$b, reason: collision with other inner class name */
        public static class C0357b {

            /* JADX INFO: renamed from: com.android.billingclient.api.e$b$b$a */
            public static class a {
            }
        }

        /* synthetic */ b(a aVar, p131h4.H h10) {
            this.f27692a = aVar.f27694a;
            this.f27693b = aVar.f27695b;
            a.d(aVar);
        }

        public static a b() {
            return new a(null);
        }

        public C0357b a() {
            return null;
        }

        public final C2137j c() {
            return this.f27692a;
        }

        public final String d() {
            return this.f27693b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.e$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27698c = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.e$c$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f27699a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f27700b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f27701c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f27702d = 0;

            /* synthetic */ a(p131h4.H h10) {
            }

            static /* synthetic */ a e(a aVar) {
                aVar.f27701c = true;
                return aVar;
            }

            public c a() {
                boolean z10 = true;
                if (TextUtils.isEmpty(this.f27699a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f27700b);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f27701c && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(null);
                cVar.f27696a = this.f27699a;
                cVar.f27698c = this.f27702d;
                cVar.f27697b = this.f27700b;
                return cVar;
            }

            public a b(String str) {
                this.f27699a = str;
                return this;
            }

            public a c(String str) {
                this.f27700b = str;
                return this;
            }

            public a d(int i10) {
                this.f27702d = i10;
                return this;
            }

            public final a f(String str) {
                this.f27699a = str;
                return this;
            }
        }

        /* synthetic */ c(p131h4.H h10) {
        }

        public static a a() {
            return new a(null);
        }

        static /* bridge */ /* synthetic */ a c(c cVar) {
            a aVarA = a();
            aVarA.f(cVar.f27696a);
            aVarA.d(cVar.f27698c);
            aVarA.c(cVar.f27697b);
            return aVarA;
        }

        final int b() {
            return this.f27698c;
        }

        final String d() {
            return this.f27696a;
        }

        final String e() {
            return this.f27697b;
        }
    }

    /* synthetic */ C2132e(p131h4.H h10) {
    }

    public static a b() {
        return new a(null);
    }

    public AbstractC3458n a() {
        return null;
    }

    public int c() {
        return 0;
    }

    public final int d() {
        return this.f27682d.b();
    }

    public long e() {
        return 0L;
    }

    final C2133f f() {
        C2137j.b bVar;
        if (this.f27683e.isEmpty()) {
            return c0.f27658i;
        }
        b bVar2 = (b) this.f27683e.get(0);
        for (int i10 = 1; i10 < this.f27683e.size(); i10++) {
            b bVar3 = (b) this.f27683e.get(i10);
            if (!bVar3.c().f().equals(bVar2.c().f()) && !bVar3.c().f().equals("play_pass_subs")) {
                return c0.a(5, "All products should have same ProductType.");
            }
        }
        String strI = bVar2.c().i();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        com.google.android.gms.internal.play_billing.K k10 = this.f27683e;
        int size = k10.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar4 = (b) k10.get(i11);
            bVar4.a();
            if (bVar4.c().g() != null && bVar4.d() == null) {
                return c0.a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", bVar4.c().e()));
            }
            if (map.containsKey(bVar4.c().e())) {
                return c0.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar4.c().e()));
            }
            map.put(bVar4.c().e(), bVar4);
            if (!bVar2.c().f().equals("play_pass_subs") && !bVar4.c().f().equals("play_pass_subs") && !strI.equals(bVar4.c().i())) {
                return c0.a(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet) {
            if (map.containsKey(str)) {
                ((b) map.get(str)).a();
                return c0.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        List listD = bVar2.c().d();
        String strD = bVar2.d();
        if (strD != null && listD != null) {
            Iterator it = listD.iterator();
            do {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = (C2137j.b) it.next();
            } while (!strD.equals(bVar.g()));
            if (bVar != null && bVar.n() != null) {
                return c0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return c0.f27658i;
    }

    public final String g() {
        return this.f27680b;
    }

    public final String h() {
        return this.f27681c;
    }

    public String i() {
        return null;
    }

    public final String j() {
        return this.f27682d.d();
    }

    public final String k() {
        return this.f27682d.e();
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f27684f);
        return arrayList;
    }

    public final List m() {
        return this.f27683e;
    }

    public final boolean v() {
        return this.f27685g;
    }

    final boolean w() {
        if (this.f27680b != null || this.f27681c != null || this.f27682d.e() != null || this.f27682d.b() != 0 || this.f27679a || this.f27685g) {
            return true;
        }
        com.google.android.gms.internal.play_billing.K k10 = this.f27683e;
        if (k10 != null) {
            int size = k10.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) k10.get(i10)).a();
            }
        }
        return false;
    }
}
