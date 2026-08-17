package p375uf;

import Ad.AbstractC0793c;
import Cf.a;
import If.C1106h;
import If.C1109k;
import If.InterfaceC1107i;
import If.InterfaceC1108j;
import If.O;
import If.Y;
import If.a0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.K;
import kotlin.collections.N;
import kotlin.io.c;
import kotlin.jvm.internal.AbstractC3966c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p339sf.A;
import p339sf.D;
import p339sf.E;
import p339sf.F;
import p339sf.InterfaceC4186e;
import p339sf.r;
import p339sf.t;
import p339sf.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f55637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f55638b = t.f54056b.i(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F f55639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f55640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final O f55641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeZone f55642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Regex f55643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f55644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f55645i;

    static {
        byte[] bArr = new byte[0];
        f55637a = bArr;
        f55639c = F.a.f(F.f53774a, bArr, null, 1, null);
        f55640d = D.a.l(D.f53738a, bArr, null, 0, 0, 7, null);
        O.a aVar = O.f5442d;
        C1109k.a aVar2 = C1109k.f5523d;
        f55641e = aVar.d(aVar2.e("efbbbf"), aVar2.e("feff"), aVar2.e("fffe"), aVar2.e("0000ffff"), aVar2.e("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.c(timeZone);
        f55642f = timeZone;
        f55643g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f55644h = false;
        String name = A.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f55645i = StringsKt.B0(StringsKt.A0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12--;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean F(a aVar, File file) throws IOException {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        Y yF = aVar.f(file);
        try {
            try {
                aVar.h(file);
                c.a(yF, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.f48228a;
                c.a(yF, null);
                aVar.h(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(yF, th);
                throw th2;
            }
        }
    }

    public static final boolean G(Socket socket, InterfaceC1108j source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.z2();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean H(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.z(name, "Authorization", true) || StringsKt.z(name, "Cookie", true) || StringsKt.z(name, "Proxy-Authorization", true) || StringsKt.z(name, "Set-Cookie", true);
    }

    public static final int I(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset J(InterfaceC1108j interfaceC1108j, Charset charset) {
        Intrinsics.checkNotNullParameter(interfaceC1108j, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iH3 = interfaceC1108j.H3(f55641e);
        if (iH3 == -1) {
            return charset;
        }
        if (iH3 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iH3 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iH3 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iH3 == 3) {
            return Charsets.f48474a.a();
        }
        if (iH3 == 4) {
            return Charsets.f48474a.b();
        }
        throw new AssertionError();
    }

    public static final int K(InterfaceC1108j interfaceC1108j) {
        Intrinsics.checkNotNullParameter(interfaceC1108j, "<this>");
        return d(interfaceC1108j.readByte(), 255) | (d(interfaceC1108j.readByte(), 255) << 16) | (d(interfaceC1108j.readByte(), 255) << 8);
    }

    public static final int L(C1106h c1106h, byte b10) throws EOFException {
        Intrinsics.checkNotNullParameter(c1106h, "<this>");
        int i10 = 0;
        while (!c1106h.z2() && c1106h.o(0L) == b10) {
            i10++;
            c1106h.readByte();
        }
        return i10;
    }

    public static final boolean M(a0 a0Var, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = a0Var.C().e() ? a0Var.C().c() - jNanoTime : Long.MAX_VALUE;
        a0Var.C().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C1106h c1106h = new C1106h();
            while (a0Var.o0(c1106h, 8192L) != -1) {
                c1106h.c();
            }
            if (jC == Long.MAX_VALUE) {
                a0Var.C().a();
                return true;
            }
            a0Var.C().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                a0Var.C().a();
                return false;
            }
            a0Var.C().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                a0Var.C().a();
            } else {
                a0Var.C().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ThreadFactory N(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new d(name, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread O(String name, boolean z10, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List P(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        IntRange intRangeT = kotlin.ranges.e.t(0, tVar.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.w(intRangeT, 10));
        Iterator it = intRangeT.iterator();
        while (it.hasNext()) {
            int iNextInt = ((K) it).nextInt();
            arrayList.add(new Bf.c(tVar.e(iNextInt), tVar.k(iNextInt)));
        }
        return arrayList;
    }

    public static final t Q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        t.a aVar = new t.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bf.c cVar = (Bf.c) it.next();
            aVar.c(cVar.a().S(), cVar.b().S());
        }
        return aVar.e();
    }

    public static final String R(int i10) {
        String hexString = Integer.toHexString(i10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(long j10) {
        String hexString = Long.toHexString(j10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String T(u uVar, boolean z10) {
        String strH;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (StringsKt.U(uVar.h(), ":", false, 2, null)) {
            strH = '[' + uVar.h() + ']';
        } else {
            strH = uVar.h();
        }
        if (!z10 && uVar.m() == u.f54059k.c(uVar.q())) {
            return strH;
        }
        return strH + ':' + uVar.m();
    }

    public static /* synthetic */ String U(u uVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return T(uVar, z10);
    }

    public static final List V(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.W0(list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Map W(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return N.i();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long X(String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int Y(String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String Z(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iZ = z(str, i10, i11);
        String strSubstring = str.substring(iZ, B(str, iZ, i11));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String a0(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return Z(str, i10, i11);
    }

    public static final Throwable b0(Exception exc, List suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC0793c.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void c(List list, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final void c0(InterfaceC1107i interfaceC1107i, int i10) {
        Intrinsics.checkNotNullParameter(interfaceC1107i, "<this>");
        interfaceC1107i.writeByte((i10 >>> 16) & 255);
        interfaceC1107i.writeByte((i10 >>> 8) & 255);
        interfaceC1107i.writeByte(i10 & 255);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final r.c g(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return new c(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r h(r this_asFactory, InterfaceC4186e it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f55643g.d(str);
    }

    public static final boolean j(u uVar, u other) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.b(uVar.h(), other.h()) && uVar.m() == other.m() && Intrinsics.b(uVar.q(), other.q());
    }

    public static final int k(String name, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[AbstractC3952n.X(strArr2)] = value;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int q(String str, String delimiters, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt.T(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(a0 a0Var, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return M(a0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        J j10 = J.f48342a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = AbstractC3966c.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(E e10) {
        Intrinsics.checkNotNullParameter(e10, "<this>");
        String strC = e10.s().c("Content-Length");
        if (strC != null) {
            return X(strC, -1L);
        }
        return -1L;
    }

    public static final List w(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.o(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.e(cCharAt, 31) <= 0 || Intrinsics.e(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
