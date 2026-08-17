package p170j8;

import android.accounts.Account;
import android.support.v4.media.session.b;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p323s.C4102b;

/* JADX INFO: renamed from: j8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3840e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Account f46939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f46940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f46941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f46942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f46943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f46944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f46945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f46946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final V8.a f46947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f46948j;

    /* JADX INFO: renamed from: j8.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Account f46949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C4102b f46950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f46951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f46952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final V8.a f46953e = V8.a.f14226j;

        public C3840e a() {
            return new C3840e(this.f46949a, this.f46950b, null, 0, null, this.f46951c, this.f46952d, this.f46953e, false);
        }

        public a b(String str) {
            this.f46951c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f46950b == null) {
                this.f46950b = new C4102b();
            }
            this.f46950b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f46949a = account;
            return this;
        }

        public final a e(String str) {
            this.f46952d = str;
            return this;
        }
    }

    public C3840e(Account account, Set set, Map map, int i10, View view, String str, String str2, V8.a aVar, boolean z10) {
        this.f46939a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f46940b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f46942d = map;
        this.f46944f = view;
        this.f46943e = i10;
        this.f46945g = str;
        this.f46946h = str2;
        this.f46947i = aVar == null ? V8.a.f14226j : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            b.a(it.next());
            throw null;
        }
        this.f46941c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f46939a;
    }

    public String b() {
        Account account = this.f46939a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f46939a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set d() {
        return this.f46941c;
    }

    public Set e(p135h8.a aVar) {
        b.a(this.f46942d.get(aVar));
        return this.f46940b;
    }

    public int f() {
        return this.f46943e;
    }

    public String g() {
        return this.f46945g;
    }

    public Set h() {
        return this.f46940b;
    }

    public View i() {
        return this.f46944f;
    }

    public final V8.a j() {
        return this.f46947i;
    }

    public final Integer k() {
        return this.f46948j;
    }

    public final String l() {
        return this.f46946h;
    }

    public final void m(Integer num) {
        this.f46948j = num;
    }
}
