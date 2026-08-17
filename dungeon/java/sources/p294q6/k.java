package p294q6;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p020b1.AbstractC2044c;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f51516q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f51517r;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double[] f51518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Object f51519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f51520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f51521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f51522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f51523n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private B f51524o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Object f51525p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int d(double d10, double[] dArr) {
            int i10 = 1;
            while (i10 < dArr.length - 1 && dArr[i10] < d10) {
                i10++;
            }
            return i10 - 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double[] e(ReadableArray readableArray) {
            if (readableArray == null) {
                return new double[0];
            }
            int size = readableArray.size();
            double[] dArr = new double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = readableArray.getDouble(i10);
            }
            return dArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int[] f(ReadableArray readableArray) {
            if (readableArray == null) {
                return new int[0];
            }
            int size = readableArray.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = readableArray.getInt(i10);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double[][] g(ReadableArray readableArray) {
            int size = readableArray.size();
            double[][] dArr = new double[size][];
            Pattern pattern = k.f51517r;
            String string = readableArray.getString(0);
            if (string == null) {
                string = "";
            }
            Matcher matcher = pattern.matcher(string);
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                String strGroup = matcher.group();
                Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
                arrayList.add(Double.valueOf(Double.parseDouble(strGroup)));
            }
            int size2 = arrayList.size();
            double[] dArr2 = new double[size2];
            int size3 = arrayList.size();
            for (int i10 = 0; i10 < size3; i10++) {
                dArr2[i10] = ((Number) arrayList.get(i10)).doubleValue();
            }
            dArr[0] = dArr2;
            for (int i11 = 1; i11 < size; i11++) {
                double[] dArr3 = new double[size2];
                Pattern pattern2 = k.f51517r;
                String string2 = readableArray.getString(i11);
                if (string2 == null) {
                    string2 = "";
                }
                Matcher matcher2 = pattern2.matcher(string2);
                for (int i12 = 0; matcher2.find() && i12 < size2; i12++) {
                    String strGroup2 = matcher2.group();
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "group(...)");
                    dArr3[i12] = Double.parseDouble(strGroup2);
                }
                dArr[i11] = dArr3;
            }
            return dArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
            if (r22.equals("extend") != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        
            if (r23.equals("extend") != false) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final double h(double r12, double r14, double r16, double r18, double r20, java.lang.String r22, java.lang.String r23) {
            /*
                r11 = this;
                r0 = r22
                r1 = r23
                int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                java.lang.String r3 = "Invalid extrapolation type "
                java.lang.String r4 = "extend"
                java.lang.String r5 = "identity"
                java.lang.String r6 = "clamp"
                r7 = 94742715(0x5a5a8bb, float:1.5578507E-35)
                r8 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
                r9 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
                if (r2 >= 0) goto L55
                if (r0 == 0) goto L3b
                int r10 = r0.hashCode()
                if (r10 == r9) goto L34
                if (r10 == r8) goto L2d
                if (r10 != r7) goto L3b
                boolean r12 = r0.equals(r6)
                if (r12 == 0) goto L3b
                r12 = r14
                goto L55
            L2d:
                boolean r1 = r0.equals(r5)
                if (r1 == 0) goto L3b
                return r12
            L34:
                boolean r10 = r0.equals(r4)
                if (r10 == 0) goto L3b
                goto L55
            L3b:
                com.facebook.react.bridge.JSApplicationIllegalArgumentException r12 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r3)
                r13.append(r0)
                java.lang.String r0 = "for left extrapolation"
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L55:
                int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
                if (r0 <= 0) goto L96
                if (r1 == 0) goto L7c
                int r0 = r1.hashCode()
                if (r0 == r9) goto L75
                if (r0 == r8) goto L6e
                if (r0 != r7) goto L7c
                boolean r12 = r1.equals(r6)
                if (r12 == 0) goto L7c
                r12 = r16
                goto L96
            L6e:
                boolean r0 = r1.equals(r5)
                if (r0 == 0) goto L7c
                return r12
            L75:
                boolean r0 = r1.equals(r4)
                if (r0 == 0) goto L7c
                goto L96
            L7c:
                com.facebook.react.bridge.JSApplicationIllegalArgumentException r12 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r3)
                r13.append(r1)
                java.lang.String r0 = "for right extrapolation"
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L96:
                int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
                if (r0 != 0) goto L9b
                return r18
            L9b:
                int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r0 != 0) goto La3
                if (r2 > 0) goto La2
                return r18
            La2:
                return r20
            La3:
                double r0 = r20 - r18
                double r12 = r12 - r14
                double r0 = r0 * r12
                double r12 = r16 - r14
                double r0 = r0 / r12
                double r12 = r18 + r0
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.k.a.h(double, double, double, double, double, java.lang.String, java.lang.String):double");
        }

        public final double i(double d10, double[] inputRange, double[] outputRange, String str, String str2) {
            Intrinsics.checkNotNullParameter(inputRange, "inputRange");
            Intrinsics.checkNotNullParameter(outputRange, "outputRange");
            int iD = d(d10, inputRange);
            int i10 = iD + 1;
            return h(d10, inputRange[iD], inputRange[i10], outputRange[iD], outputRange[i10], str, str2);
        }

        public final int j(double d10, double[] inputRange, int[] outputRange) {
            Intrinsics.checkNotNullParameter(inputRange, "inputRange");
            Intrinsics.checkNotNullParameter(outputRange, "outputRange");
            int iD = d(d10, inputRange);
            int i10 = outputRange[iD];
            int i11 = iD + 1;
            int i12 = outputRange[i11];
            if (i10 != i12) {
                double d11 = inputRange[iD];
                double d12 = inputRange[i11];
                if (d11 != d12) {
                    return AbstractC2044c.c(i10, i12, (float) ((d10 - d11) / (d12 - d11)));
                }
                if (d10 > d11) {
                    return i12;
                }
            }
            return i10;
        }

        public final String k(String pattern, double d10, double[] dArr, double[][] outputRange, String str, String str2) {
            double[] inputRange = dArr;
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(inputRange, "inputRange");
            Intrinsics.checkNotNullParameter(outputRange, "outputRange");
            a aVar = this;
            double d11 = d10;
            int iD = aVar.d(d11, inputRange);
            StringBuffer stringBuffer = new StringBuffer(pattern.length());
            Matcher matcher = k.f51517r.matcher(pattern);
            int i10 = 0;
            while (matcher.find()) {
                double[] dArr2 = outputRange[iD];
                if (i10 >= dArr2.length) {
                    break;
                }
                int i11 = iD + 1;
                StringBuffer stringBuffer2 = stringBuffer;
                int i12 = i10;
                double dH = aVar.h(d11, inputRange[iD], inputRange[i11], dArr2[i10], outputRange[i11][i10], str, str2);
                int i13 = (int) dH;
                matcher.appendReplacement(stringBuffer2, ((double) i13) == dH ? String.valueOf(i13) : String.valueOf(dH));
                i10 = i12 + 1;
                aVar = this;
                d11 = d10;
                stringBuffer = stringBuffer2;
                inputRange = dArr;
            }
            StringBuffer stringBuffer3 = stringBuffer;
            matcher.appendTail(stringBuffer3);
            String string = stringBuffer3.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    private enum b {
        Number,
        Color,
        String;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f51530e = Gd.a.a(e());
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51531a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Color.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51531a = iArr;
        }
    }

    static {
        Pattern patternCompile = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        f51517r = patternCompile;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ReadableMap config) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        a aVar = f51516q;
        this.f51518i = aVar.e(config.getArray("inputRange"));
        this.f51522m = config.getString("extrapolateLeft");
        this.f51523n = config.getString("extrapolateRight");
        ReadableArray array = config.getArray("outputRange");
        if (Intrinsics.b("color", config.getString("outputType"))) {
            this.f51520k = b.Color;
            this.f51519j = aVar.f(array);
            return;
        }
        if ((array != null ? array.getType(0) : null) != ReadableType.String) {
            this.f51520k = b.Number;
            this.f51519j = aVar.e(array);
        } else {
            this.f51520k = b.String;
            this.f51519j = aVar.g(array);
            this.f51521l = array.getString(0);
        }
    }

    @Override // p294q6.AbstractC4070b
    public void c(AbstractC4070b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.f51524o != null) {
            throw new IllegalStateException("Parent already attached");
        }
        if (!(parent instanceof B)) {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        this.f51524o = (B) parent;
    }

    @Override // p294q6.AbstractC4070b
    public void d(AbstractC4070b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent != this.f51524o) {
            throw new IllegalArgumentException("Invalid parent node provided");
        }
        this.f51524o = null;
    }

    @Override // p294q6.B, p294q6.AbstractC4070b
    public String e() {
        return "InterpolationAnimatedNode[" + this.f51480d + "] super: " + super.e();
    }

    @Override // p294q6.AbstractC4070b
    public void h() {
        String str;
        B b10 = this.f51524o;
        if (b10 != null) {
            double dL = b10.l();
            b bVar = this.f51520k;
            int i10 = bVar == null ? -1 : c.f51531a[bVar.ordinal()];
            if (i10 == 1) {
                a aVar = f51516q;
                double[] dArr = this.f51518i;
                Object obj = this.f51519j;
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.DoubleArray");
                this.f51471f = aVar.i(dL, dArr, (double[]) obj, this.f51522m, this.f51523n);
                return;
            }
            if (i10 == 2) {
                a aVar2 = f51516q;
                double[] dArr2 = this.f51518i;
                Object obj2 = this.f51519j;
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.IntArray");
                this.f51525p = Integer.valueOf(aVar2.j(dL, dArr2, (int[]) obj2));
                return;
            }
            if (i10 == 3 && (str = this.f51521l) != null) {
                a aVar3 = f51516q;
                double[] dArr3 = this.f51518i;
                Object obj3 = this.f51519j;
                Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.DoubleArray>");
                this.f51525p = aVar3.k(str, dL, dArr3, (double[][]) obj3, this.f51522m, this.f51523n);
            }
        }
    }

    @Override // p294q6.B
    public Object k() {
        return this.f51525p;
    }
}
