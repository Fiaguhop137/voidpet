package p055d0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3217a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f39542b = new d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3217a f39543c = new C0435a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC3217a f39544d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC3217a f39545e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f39546a;

    /* JADX INFO: renamed from: d0.a$a, reason: collision with other inner class name */
    public static final class C0435a extends AbstractC3217a {
        C0435a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: renamed from: d0.a$b */
    public static final class b extends AbstractC3217a {
        b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: renamed from: d0.a$c */
    public static final class c extends AbstractC3217a {
        c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* JADX INFO: renamed from: d0.a$d */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC3217a a() {
            return AbstractC3217a.f39543c;
        }
    }

    private AbstractC3217a(float[] fArr) {
        this.f39546a = fArr;
    }

    public /* synthetic */ AbstractC3217a(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    public final float[] b() {
        return this.f39546a;
    }
}
