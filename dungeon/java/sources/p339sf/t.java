package p339sf;

import Ad.v;
import Hd.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC3966c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import kotlin.text.StringsKt;
import p375uf.e;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Iterable, Nd.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f54056b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f54057a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f54058a = new ArrayList(20);

        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = t.f54056b;
            bVar.e(name);
            bVar.f(value, name);
            c(name, value);
            return this;
        }

        public final a b(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iG0 = StringsKt.g0(line, ':', 1, false, 4, null);
            if (iG0 != -1) {
                String strSubstring = line.substring(0, iG0);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iG0 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            c("", strSubstring3);
            return this;
        }

        public final a c(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f54058a.add(name);
            this.f54058a.add(StringsKt.f1(value).toString());
            return this;
        }

        public final a d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            t.f54056b.e(name);
            c(name, value);
            return this;
        }

        public final t e() {
            return new t((String[]) this.f54058a.toArray(new String[0]), null);
        }

        public final String f(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int size = this.f54058a.size() - 2;
            int iC = c.c(size, 0, -2);
            if (iC > size) {
                return null;
            }
            while (!StringsKt.z(name, (String) this.f54058a.get(size), true)) {
                if (size == iC) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.f54058a.get(size + 1);
        }

        public final List g() {
            return this.f54058a;
        }

        public final a h(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i10 = 0;
            while (i10 < this.f54058a.size()) {
                if (StringsKt.z(name, (String) this.f54058a.get(i10), true)) {
                    this.f54058a.remove(i10);
                    this.f54058a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a i(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = t.f54056b;
            bVar.e(name);
            bVar.f(value, name);
            h(name);
            c(name, value);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(e.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb2.append(e.H(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String g(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iC = c.c(length, 0, -2);
            if (iC > length) {
                return null;
            }
            while (!StringsKt.z(str, strArr[length], true)) {
                if (length == iC) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        public final t a(Map headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return h(headers);
        }

        public final t h(Map map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String string = StringsKt.f1(str).toString();
                String string2 = StringsKt.f1(str2).toString();
                e(string);
                f(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new t(strArr, null);
        }

        public final t i(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = StringsKt.f1(str).toString();
            }
            int iC = c.c(0, strArr.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    e(str2);
                    f(str3, str2);
                    if (i10 == iC) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new t(strArr, null);
        }
    }

    private t(String[] strArr) {
        this.f54057a = strArr;
    }

    public /* synthetic */ t(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public final int a() {
        return size();
    }

    public final String c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f54056b.g(this.f54057a, name);
    }

    public final String e(int i10) {
        return this.f54057a[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f54057a, ((t) obj).f54057a);
    }

    public final Set g() {
        TreeSet treeSet = new TreeSet(StringsKt.B(J.f48342a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(e(i10));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final a h() {
        a aVar = new a();
        CollectionsKt.D(aVar.g(), this.f54057a);
        return aVar;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f54057a);
    }

    public final Map i() {
        TreeMap treeMap = new TreeMap(StringsKt.B(J.f48342a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strE = e(i10);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strE.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(k(i10));
        }
        return treeMap;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = v.a(e(i10), k(i10));
        }
        return AbstractC3966c.a(pairArr);
    }

    public final String k(int i10) {
        return this.f54057a[(i10 * 2) + 1];
    }

    public final List n(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.z(name, e(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(k(i10));
            }
        }
        if (arrayList == null) {
            return CollectionsKt.l();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f54057a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strE = e(i10);
            String strK = k(i10);
            sb2.append(strE);
            sb2.append(": ");
            if (e.H(strE)) {
                strK = "██";
            }
            sb2.append(strK);
            sb2.append("\n");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
