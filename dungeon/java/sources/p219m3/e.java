package p219m3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p183k3.j;
import p291q3.g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f49053e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f49055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f49056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f49057d;

    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0580a f49058h = new C0580a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f49060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f49061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f49063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f49064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f49065g;

        /* JADX INFO: renamed from: m3.e$a$a, reason: collision with other inner class name */
        public static final class C0580a {
            private C0580a() {
            }

            public /* synthetic */ C0580a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && (i11 = i11 - 1) == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            public final boolean b(String current, String str) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.b(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Intrinsics.b(StringsKt.f1(strSubstring).toString(), str);
            }
        }

        public a(String name, String type, boolean z10, int i10, String str, int i11) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f49059a = name;
            this.f49060b = type;
            this.f49061c = z10;
            this.f49062d = i10;
            this.f49063e = str;
            this.f49064f = i11;
            this.f49065g = a(type);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.U(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (StringsKt.U(upperCase, "CHAR", false, 2, null) || StringsKt.U(upperCase, "CLOB", false, 2, null) || StringsKt.U(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (StringsKt.U(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (StringsKt.U(upperCase, "REAL", false, 2, null) || StringsKt.U(upperCase, "FLOA", false, 2, null) || StringsKt.U(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f49062d != ((a) obj).f49062d) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.b(this.f49059a, aVar.f49059a) || this.f49061c != aVar.f49061c) {
                return false;
            }
            if (this.f49064f == 1 && aVar.f49064f == 2 && (str3 = this.f49063e) != null && !f49058h.b(str3, aVar.f49063e)) {
                return false;
            }
            if (this.f49064f == 2 && aVar.f49064f == 1 && (str2 = aVar.f49063e) != null && !f49058h.b(str2, this.f49063e)) {
                return false;
            }
            int i10 = this.f49064f;
            return (i10 == 0 || i10 != aVar.f49064f || ((str = this.f49063e) == null ? aVar.f49063e == null : f49058h.b(str, aVar.f49063e))) && this.f49065g == aVar.f49065g;
        }

        public int hashCode() {
            return (((((this.f49059a.hashCode() * 31) + this.f49065g) * 31) + (this.f49061c ? 1231 : 1237)) * 31) + this.f49062d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f49059a);
            sb2.append("', type='");
            sb2.append(this.f49060b);
            sb2.append("', affinity='");
            sb2.append(this.f49065g);
            sb2.append("', notNull=");
            sb2.append(this.f49061c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f49062d);
            sb2.append(", defaultValue='");
            String str = this.f49063e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(g database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return f.f(database, tableName);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f49067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f49068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f49069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f49070e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.f49066a = referenceTable;
            this.f49067b = onDelete;
            this.f49068c = onUpdate;
            this.f49069d = columnNames;
            this.f49070e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Intrinsics.b(this.f49066a, cVar.f49066a) && Intrinsics.b(this.f49067b, cVar.f49067b) && Intrinsics.b(this.f49068c, cVar.f49068c) && Intrinsics.b(this.f49069d, cVar.f49069d)) {
                return Intrinsics.b(this.f49070e, cVar.f49070e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f49066a.hashCode() * 31) + this.f49067b.hashCode()) * 31) + this.f49068c.hashCode()) * 31) + this.f49069d.hashCode()) * 31) + this.f49070e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f49066a + "', onDelete='" + this.f49067b + " +', onUpdate='" + this.f49068c + "', columnNames=" + this.f49069d + ", referenceColumnNames=" + this.f49070e + '}';
        }
    }

    public static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f49071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f49072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f49073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f49074d;

        public d(int i10, int i11, String from, String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.f49071a = i10;
            this.f49072b = i11;
            this.f49073c = from;
            this.f49074d = to;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(d other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i10 = this.f49071a - other.f49071a;
            return i10 == 0 ? this.f49072b - other.f49072b : i10;
        }

        public final String g() {
            return this.f49073c;
        }

        public final int h() {
            return this.f49071a;
        }

        public final String i() {
            return this.f49074d;
        }
    }

    /* JADX INFO: renamed from: m3.e$e, reason: collision with other inner class name */
    public static final class C0581e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f49075e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f49078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f49079d;

        /* JADX INFO: renamed from: m3.e$e$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public C0581e(String name, boolean z10, List columns, List orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.f49076a = name;
            this.f49077b = z10;
            this.f49078c = columns;
            this.f49079d = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    orders.add(j.ASC.name());
                }
            }
            this.f49079d = orders;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0581e)) {
                return false;
            }
            C0581e c0581e = (C0581e) obj;
            if (this.f49077b == c0581e.f49077b && Intrinsics.b(this.f49078c, c0581e.f49078c) && Intrinsics.b(this.f49079d, c0581e.f49079d)) {
                return StringsKt.O(this.f49076a, "index_", false, 2, null) ? StringsKt.O(c0581e.f49076a, "index_", false, 2, null) : Intrinsics.b(this.f49076a, c0581e.f49076a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((StringsKt.O(this.f49076a, "index_", false, 2, null) ? -1184239155 : this.f49076a.hashCode()) * 31) + (this.f49077b ? 1 : 0)) * 31) + this.f49078c.hashCode()) * 31) + this.f49079d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f49076a + "', unique=" + this.f49077b + ", columns=" + this.f49078c + ", orders=" + this.f49079d + "'}";
        }
    }

    public e(String name, Map columns, Set foreignKeys, Set set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f49054a = name;
        this.f49055b = columns;
        this.f49056c = foreignKeys;
        this.f49057d = set;
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!Intrinsics.b(this.f49054a, eVar.f49054a) || !Intrinsics.b(this.f49055b, eVar.f49055b) || !Intrinsics.b(this.f49056c, eVar.f49056c)) {
            return false;
        }
        Set set2 = this.f49057d;
        if (set2 == null || (set = eVar.f49057d) == null) {
            return true;
        }
        return Intrinsics.b(set2, set);
    }

    public int hashCode() {
        return (((this.f49054a.hashCode() * 31) + this.f49055b.hashCode()) * 31) + this.f49056c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f49054a + "', columns=" + this.f49055b + ", foreignKeys=" + this.f49056c + ", indices=" + this.f49057d + '}';
    }
}
