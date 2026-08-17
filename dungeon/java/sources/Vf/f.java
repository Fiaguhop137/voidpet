package Vf;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class f extends Permission {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f14343a;

    public f(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f14343a = hashSet;
        hashSet.add(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f14343a.equals(((f) obj).f14343a);
    }

    @Override // java.security.Permission
    public String getActions() {
        return this.f14343a.toString();
    }

    public int hashCode() {
        return this.f14343a.hashCode();
    }

    @Override // java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof f)) {
            return false;
        }
        f fVar = (f) permission;
        return getName().equals(fVar.getName()) || this.f14343a.containsAll(fVar.f14343a);
    }
}
