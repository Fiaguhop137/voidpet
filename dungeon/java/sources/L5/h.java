package L5;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ULocale f6362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ULocale.Builder f6363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6364c;

    private h(ULocale uLocale) {
        this.f6363b = null;
        this.f6364c = false;
        this.f6362a = uLocale;
    }

    private h(String str) throws f {
        this.f6362a = null;
        this.f6363b = null;
        this.f6364c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f6363b = builder;
        try {
            builder.setLanguageTag(str);
            this.f6364c = true;
        } catch (RuntimeException e10) {
            throw new f(e10.getMessage());
        }
    }

    public static b i() {
        return new h(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static b j(String str) {
        return new h(str);
    }

    public static b k(ULocale uLocale) {
        return new h(uLocale);
    }

    private void l() throws f {
        if (this.f6364c) {
            try {
                this.f6362a = this.f6363b.build();
                this.f6364c = false;
            } catch (RuntimeException e10) {
                throw new f(e10.getMessage());
            }
        }
    }

    @Override // L5.b
    public HashMap a() throws f {
        l();
        HashMap map = new HashMap();
        Iterator<String> keywords = this.f6362a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                map.put(j.b(next), this.f6362a.getKeywordValue(next));
            }
        }
        return map;
    }

    @Override // L5.b
    public ArrayList b(String str) throws f {
        l();
        String strA = j.a(str);
        ArrayList arrayList = new ArrayList();
        String keywordValue = this.f6362a.getKeywordValue(strA);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // L5.b
    public b d() throws f {
        l();
        return new h(this.f6362a);
    }

    @Override // L5.b
    public String e() {
        return c().toLanguageTag();
    }

    @Override // L5.b
    public void f(String str, ArrayList arrayList) throws f {
        l();
        if (this.f6363b == null) {
            this.f6363b = new ULocale.Builder().setLocale(this.f6362a);
        }
        try {
            this.f6363b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f6364c = true;
        } catch (RuntimeException e10) {
            throw new f(e10.getMessage());
        }
    }

    @Override // L5.b
    public String g() {
        return h().toLanguageTag();
    }

    @Override // L5.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ULocale h() throws f {
        l();
        return this.f6362a;
    }

    @Override // L5.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ULocale c() throws f {
        l();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f6362a);
        builder.clearExtensions();
        return builder.build();
    }
}
