package Z1;

import C9.AbstractC0878v;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y1 f18586i = new b().h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0878v f18587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f18588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f18589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18594h;

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f18596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Double f18597c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC0878v f18595a = AbstractC0878v.x(1, 5);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18598d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f18599e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18600f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f18601g = true;

        public y1 h() {
            return new y1(this, null);
        }
    }

    private y1(b bVar) {
        this.f18587a = bVar.f18595a;
        this.f18588b = bVar.f18596b;
        this.f18589c = bVar.f18597c;
        this.f18590d = bVar.f18598d;
        this.f18591e = !bVar.f18599e;
        this.f18592f = bVar.f18599e;
        this.f18593g = bVar.f18600f;
        this.f18594h = bVar.f18601g;
    }

    /* synthetic */ y1(b bVar, a aVar) {
        this(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.f18587a.equals(y1Var.f18587a) && this.f18592f == y1Var.f18592f && Objects.equals(this.f18588b, y1Var.f18588b) && Objects.equals(this.f18589c, y1Var.f18589c) && this.f18590d == y1Var.f18590d && this.f18593g == y1Var.f18593g && this.f18594h == y1Var.f18594h;
    }

    public int hashCode() {
        return Objects.hash(this.f18587a, this.f18588b, this.f18589c, Boolean.valueOf(this.f18590d), Boolean.valueOf(this.f18592f), Boolean.valueOf(this.f18593g), Boolean.valueOf(this.f18594h));
    }
}
