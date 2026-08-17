package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private J4.c f28678a = J4.a.a();

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    final J4.c c() {
        return this.f28678a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return L4.l.e(this.f28678a, ((m) obj).f28678a);
        }
        return false;
    }

    public int hashCode() {
        J4.c cVar = this.f28678a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
