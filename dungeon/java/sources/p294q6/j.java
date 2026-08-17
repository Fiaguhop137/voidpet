package p294q6;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f51508l = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f51509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double[] f51510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f51511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f51512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f51515k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f51509e = -1L;
        this.f51510f = new double[0];
        this.f51513i = 1;
        this.f51514j = 1;
        a(config);
    }

    @Override // p294q6.e
    public void a(ReadableMap config) {
        int size;
        Intrinsics.checkNotNullParameter(config, "config");
        ReadableArray array = config.getArray("frames");
        if (array != null && this.f51510f.length != (size = array.size())) {
            double[] dArr = new double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = array.getDouble(i10);
            }
            this.f51510f = dArr;
        }
        this.f51511g = (config.hasKey("toValue") && config.getType("toValue") == ReadableType.Number) ? config.getDouble("toValue") : 0.0d;
        int i11 = (config.hasKey("iterations") && config.getType("iterations") == ReadableType.Number) ? config.getInt("iterations") : 1;
        this.f51513i = i11;
        this.f51514j = 1;
        this.f51481a = i11 == 0;
        this.f51509e = -1L;
    }

    @Override // p294q6.e
    public void b(long j10) {
        double d10;
        B b10 = this.f51482b;
        if (b10 == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        if (this.f51509e < 0) {
            this.f51509e = j10;
            if (this.f51514j == 1) {
                this.f51512h = b10.f51471f;
            }
        }
        int iRound = (int) Math.round(((j10 - this.f51509e) / ((long) 1000000)) / 16.666666666666668d);
        if (iRound < 0) {
            String str = "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + j10 + " and mStartFrameTimeNanos " + this.f51509e;
            if (p384v6.a.f56277b) {
                throw new IllegalStateException(str.toString());
            }
            if (this.f51515k < 100) {
                W4.a.I("ReactNative", str);
                this.f51515k++;
                return;
            }
            return;
        }
        if (this.f51481a) {
            return;
        }
        double[] dArr = this.f51510f;
        if (iRound >= dArr.length - 1) {
            int i10 = this.f51513i;
            if (i10 == -1 || this.f51514j < i10) {
                double d11 = this.f51512h;
                d10 = d11 + (dArr[dArr.length - 1] * (this.f51511g - d11));
                this.f51509e = -1L;
                this.f51514j++;
            } else {
                d10 = this.f51511g;
                this.f51481a = true;
            }
        } else {
            double d12 = this.f51512h;
            d10 = d12 + (dArr[iRound] * (this.f51511g - d12));
        }
        b10.f51471f = d10;
    }
}
