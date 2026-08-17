package p128h1;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f42510a;

    k(Object obj) {
        this.f42510a = (LocaleList) obj;
    }

    @Override // p128h1.j
    public String a() {
        return this.f42510a.toLanguageTags();
    }

    @Override // p128h1.j
    public Object b() {
        return this.f42510a;
    }

    public boolean equals(Object obj) {
        return this.f42510a.equals(((j) obj).b());
    }

    @Override // p128h1.j
    public Locale get(int i10) {
        return this.f42510a.get(i10);
    }

    public int hashCode() {
        return this.f42510a.hashCode();
    }

    @Override // p128h1.j
    public boolean isEmpty() {
        return this.f42510a.isEmpty();
    }

    @Override // p128h1.j
    public int size() {
        return this.f42510a.size();
    }

    public String toString() {
        return this.f42510a.toString();
    }
}
