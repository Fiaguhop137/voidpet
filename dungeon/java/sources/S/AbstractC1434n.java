package S;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: S.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1434n {

    /* JADX INFO: renamed from: S.n$a */
    public static final class a extends AbstractC1434n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1432l f11384a;

        public a(AbstractC1432l abstractC1432l) {
            super(null);
            this.f11384a = abstractC1432l;
        }

        @Override // S.AbstractC1434n
        public void a() throws C1433m {
            this.f11384a.d();
            throw new C1433m(this.f11384a);
        }
    }

    /* JADX INFO: renamed from: S.n$b */
    public static final class b extends AbstractC1434n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f11385a = new b();

        private b() {
            super(null);
        }

        @Override // S.AbstractC1434n
        public void a() {
        }
    }

    private AbstractC1434n() {
    }

    public /* synthetic */ AbstractC1434n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a();
}
