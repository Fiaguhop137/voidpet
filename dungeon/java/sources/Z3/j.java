package Z3;

import R3.C1364k;
import R3.L;
import R3.M;

/* JADX INFO: loaded from: classes.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f18684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18685c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a g(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f18683a = str;
        this.f18684b = aVar;
        this.f18685c = z10;
    }

    @Override // Z3.c
    public T3.c a(L l10, C1364k c1364k, p005a4.b bVar) {
        if (l10.h0(M.MergePathsApi19)) {
            return new T3.l(this);
        }
        p077e4.g.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f18684b;
    }

    public String c() {
        return this.f18683a;
    }

    public boolean d() {
        return this.f18685c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f18684b + '}';
    }
}
