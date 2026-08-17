package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001a\u001a#\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001c\u001a#\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u001a\u001a#\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b \u0010\u001c\u001a#\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u001a\u001a#\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u001c\u001a)\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010)\u001a\u00020\u0000*\u00020\u00002\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010,\u001a\u00020\u0000*\u00020\u00002\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010*\u001a!\u0010-\u001a\u00020\u0000*\u00020\u00002\u0006\u0010(\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.\u001a\u0019\u0010/\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b/\u0010*\u001a;\u00104\u001a\u00020\u0010*\u00020\u00062\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0010H\u0000¢\u0006\u0004\b4\u00105\u001a#\u00107\u001a\u00020\u0010*\u00020\u00062\u0006\u00106\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\b7\u00108\u001a#\u00109\u001a\u00020\u0010*\u00020\u00062\u0006\u00106\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\b9\u00108\u001a#\u0010:\u001a\u00020\u0010*\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;\u001a#\u0010<\u001a\u00020\u0010*\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\b<\u0010;\u001a-\u0010=\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\b=\u0010>\u001a-\u0010?\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\b?\u0010>\u001a=\u0010A\u001a\u00020\t*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00102\b\b\u0002\u0010@\u001a\u00020\u0010H\u0002¢\u0006\u0004\bA\u0010B\u001aG\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0000\u0018\u00010E*\u00020\u00062\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00000C2\u0006\u0010#\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u0010H\u0002¢\u0006\u0004\bF\u0010G\u001a-\u0010H\u001a\u00020\t*\u00020\u00062\u0006\u00106\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\bH\u0010I\u001a-\u0010K\u001a\u00020\t*\u00020\u00062\u0006\u0010J\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\bK\u0010L\u001a-\u0010M\u001a\u00020\t*\u00020\u00062\u0006\u00106\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\bM\u0010I\u001a-\u0010N\u001a\u00020\t*\u00020\u00062\u0006\u0010J\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\bN\u0010L\u001a&\u0010O\u001a\u00020\u0010*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\bO\u0010;\u001a&\u0010P\u001a\u00020\u0010*\u00020\u00062\u0006\u00106\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\bP\u00108\u001a?\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00130S*\u00020\u00062\u0006\u0010Q\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\u00102\b\b\u0002\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010U\u001aG\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00130S*\u00020\u00062\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000V2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\u00102\b\b\u0002\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010Z\u001a\u00020Y2\u0006\u0010R\u001a\u00020\tH\u0000¢\u0006\u0004\bZ\u0010[\u001a?\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00000\\*\u00020\u00062\u0012\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000V\"\u00020\u00002\b\b\u0002\u00103\u001a\u00020\u00102\b\b\u0002\u0010R\u001a\u00020\t¢\u0006\u0004\b]\u0010^\u001a7\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00000\\*\u00020\u00062\n\u0010Q\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00102\b\b\u0002\u0010R\u001a\u00020\t¢\u0006\u0004\b_\u0010`\u001a1\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00000\\*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\ba\u0010b\u001a\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00000S*\u00020\u0006¢\u0006\u0004\bc\u0010d\u001a\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000\\*\u00020\u0006¢\u0006\u0004\be\u0010f\"\u0015\u0010i\u001a\u00020\u0013*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bg\u0010h\"\u0015\u0010l\u001a\u00020\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006m"}, d2 = {"", "", "", "chars", "g1", "(Ljava/lang/String;[C)Ljava/lang/String;", "", "f1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "padChar", "r0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "s0", "(Ljava/lang/String;IC)Ljava/lang/String;", "", "j0", "(Ljava/lang/CharSequence;)Z", "Lkotlin/ranges/IntRange;", "range", "O0", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "X0", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "Y0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "P0", "Q0", "b1", "c1", "T0", "U0", "startIndex", "endIndex", "replacement", "E0", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "prefix", "A0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "B0", "D0", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "C0", "thisOffset", "other", "otherOffset", "ignoreCase", "z0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "K0", "(Ljava/lang/CharSequence;CZ)Z", "V", "L0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "W", "i0", "(Ljava/lang/CharSequence;[CIZ)I", "o0", "last", "e0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "Z", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "c0", "(Ljava/lang/CharSequence;CIZ)I", "string", "d0", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "k0", "l0", "S", "R", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "t0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "", "u0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "F0", "(I)V", "", "H0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "G0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "I0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "p0", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "q0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "a0", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "b0", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends t {

    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f48487a;

        public a(CharSequence charSequence) {
            this.f48487a = charSequence;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return new f(this.f48487a);
        }
    }

    public static String A0(String str, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!N0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String B0(String str, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!Y(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String C0(String str, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return D0(str, delimiter, delimiter);
    }

    public static final String D0(String str, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !N0(str, prefix, false, 2, null) || !Y(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final CharSequence E0(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i11, charSequence.length());
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static final void F0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List G0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return I0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableX = kotlin.sequences.k.x(v0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.w(iterableX, 10));
        Iterator it = iterableX.iterator();
        while (it.hasNext()) {
            arrayList.add(O0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final List H0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return I0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableX = kotlin.sequences.k.x(w0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.w(iterableX, 10));
        Iterator it = iterableX.iterator();
        while (it.hasNext()) {
            arrayList.add(O0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    private static final List I0(CharSequence charSequence, String str, boolean z10, int i10) {
        F0(i10);
        int length = 0;
        int iD0 = d0(charSequence, str, 0, z10);
        if (iD0 == -1 || i10 == 1) {
            return CollectionsKt.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? kotlin.ranges.e.i(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iD0).toString());
            length = str.length() + iD0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iD0 = d0(charSequence, str, length, z10);
        } while (iD0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List J0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return G0(charSequence, cArr, z10, i10);
    }

    public static final boolean K0(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.a.c(charSequence.charAt(0), c10, z10);
    }

    public static final boolean L0(CharSequence charSequence, CharSequence prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? t.O((String) charSequence, (String) prefix, false, 2, null) : z0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean M0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return K0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean N0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return L0(charSequence, charSequence2, z10);
    }

    public static final String O0(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.c().intValue(), range.e().intValue() + 1).toString();
    }

    public static final String P0(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iG0 = g0(str, c10, 0, false, 6, null);
        if (iG0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iG0 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String Q0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iH0 = h0(str, delimiter, 0, false, 6, null);
        if (iH0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iH0 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean R(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return g0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ String R0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return P0(str, c10, str2);
    }

    public static boolean S(CharSequence charSequence, CharSequence other, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            return h0(charSequence, (String) other, 0, z10, 2, null) >= 0;
        }
        return f0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static /* synthetic */ String S0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return Q0(str, str2, str3);
    }

    public static /* synthetic */ boolean T(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return R(charSequence, c10, z10);
    }

    public static String T0(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM0 = m0(str, c10, 0, false, 6, null);
        if (iM0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM0 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean U(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return S(charSequence, charSequence2, z10);
    }

    public static final String U0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iN0 = n0(str, delimiter, 0, false, 6, null);
        if (iN0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iN0 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean V(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.a.c(charSequence.charAt(b0(charSequence)), c10, z10);
    }

    public static /* synthetic */ String V0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return T0(str, c10, str2);
    }

    public static final boolean W(CharSequence charSequence, CharSequence suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? t.y((String) charSequence, (String) suffix, false, 2, null) : z0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static /* synthetic */ String W0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return U0(str, str2, str3);
    }

    public static /* synthetic */ boolean X(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return V(charSequence, c10, z10);
    }

    public static final String X0(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iG0 = g0(str, c10, 0, false, 6, null);
        if (iG0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iG0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean Y(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return W(charSequence, charSequence2, z10);
    }

    public static final String Y0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iH0 = h0(str, delimiter, 0, false, 6, null);
        if (iH0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iH0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final Pair Z(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) CollectionsKt.E0(collection);
            int iH0 = !z11 ? h0(charSequence, str, i10, false, 4, null) : n0(charSequence, str, i10, false, 4, null);
            if (iH0 < 0) {
                return null;
            }
            return Ad.v.a(Integer.valueOf(iH0), str);
        }
        CharSequence charSequence3 = charSequence;
        kotlin.ranges.b intRange = !z11 ? new IntRange(kotlin.ranges.e.e(i10, 0), charSequence3.length()) : kotlin.ranges.e.q(kotlin.ranges.e.i(i10, b0(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iG = intRange.g();
            int iH = intRange.h();
            int i11 = intRange.i();
            if ((i11 > 0 && iG <= iH) || (i11 < 0 && iH <= iG)) {
                int i12 = iG;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (t.C(str2, 0, (String) charSequence3, i12, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return Ad.v.a(Integer.valueOf(i12), str3);
                    }
                    if (i12 != iH) {
                        i12 += i11;
                        z10 = z12;
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iG2 = intRange.g();
            int iH2 = intRange.h();
            int i13 = intRange.i();
            if ((i13 > 0 && iG2 <= iH2) || (i13 < 0 && iH2 <= iG2)) {
                int i14 = iG2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (z0(str4, 0, charSequence2, i14, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return Ad.v.a(Integer.valueOf(i14), str5);
                    }
                    if (i14 != iH2) {
                        i14 += i13;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String Z0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return X0(str, c10, str2);
    }

    public static IntRange a0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String a1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return Y0(str, str2, str3);
    }

    public static int b0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String b1(String str, char c10, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM0 = m0(str, c10, 0, false, 6, null);
        if (iM0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int c0(CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? i0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static String c1(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iN0 = n0(str, delimiter, 0, false, 6, null);
        if (iN0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iN0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int d0(CharSequence charSequence, String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? f0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static /* synthetic */ String d1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return b1(str, c10, str2);
    }

    private static final int e0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        kotlin.ranges.b intRange = !z11 ? new IntRange(kotlin.ranges.e.e(i10, 0), kotlin.ranges.e.i(i11, charSequence.length())) : kotlin.ranges.e.q(kotlin.ranges.e.i(i10, b0(charSequence)), kotlin.ranges.e.e(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iG = intRange.g();
            int iH = intRange.h();
            int i12 = intRange.i();
            if ((i12 <= 0 || iG > iH) && (i12 >= 0 || iH > iG)) {
                return -1;
            }
            int i13 = iG;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (t.C(str, 0, (String) charSequence, i13, str.length(), z12)) {
                    return i13;
                }
                if (i13 == iH) {
                    return -1;
                }
                i13 += i12;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iG2 = intRange.g();
            int iH2 = intRange.h();
            int i14 = intRange.i();
            if ((i14 <= 0 || iG2 > iH2) && (i14 >= 0 || iH2 > iG2)) {
                return -1;
            }
            int i15 = iG2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (z0(charSequence4, 0, charSequence3, i15, charSequence2.length(), z14)) {
                    return i15;
                }
                if (i15 == iH2) {
                    return -1;
                }
                i15 += i14;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static /* synthetic */ String e1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return c1(str, str2, str3);
    }

    static /* synthetic */ int f0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return e0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static CharSequence f1(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zB = CharsKt__CharJVMKt.b(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ int g0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return c0(charSequence, c10, i10, z10);
    }

    public static String g1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!AbstractC3952n.K(chars, str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return d0(charSequence, str, i10, z10);
    }

    public static final int i0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC3952n.u0(chars), i10);
        }
        int iE = kotlin.ranges.e.e(i10, 0);
        int iB0 = b0(charSequence);
        if (iE > iB0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iE);
            for (char c10 : chars) {
                if (kotlin.text.a.c(c10, cCharAt, z10)) {
                    return iE;
                }
            }
            if (iE == iB0) {
                return -1;
            }
            iE++;
        }
    }

    public static boolean j0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!CharsKt__CharJVMKt.b(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int k0(CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? o0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int l0(CharSequence charSequence, String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? e0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int m0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = b0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return k0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int n0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = b0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return l0(charSequence, str, i10, z10);
    }

    public static final int o0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC3952n.u0(chars), i10);
        }
        for (int i11 = kotlin.ranges.e.i(i10, b0(charSequence)); -1 < i11; i11--) {
            char cCharAt = charSequence.charAt(i11);
            for (char c10 : chars) {
                if (kotlin.text.a.c(c10, cCharAt, z10)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public static final Sequence p0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List q0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return kotlin.sequences.k.V(p0(charSequence));
    }

    public static final CharSequence r0(CharSequence charSequence, int i10, char c10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String s0(String str, int i10, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return r0(str, i10, c10).toString();
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return H0(charSequence, strArr, z10, i10);
    }

    private static final Sequence t0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        F0(i11);
        return new b(charSequence, i10, i11, new u(cArr, z10));
    }

    private static final Sequence u0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        F0(i11);
        return new b(charSequence, i10, i11, new v(AbstractC3952n.e(strArr), z10));
    }

    static /* synthetic */ Sequence v0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return t0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ Sequence w0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return u0(charSequence, strArr, i10, z10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair x0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iI0 = i0(DelimitedRangesSequence, cArr, i10, z10);
        if (iI0 < 0) {
            return null;
        }
        return Ad.v.a(Integer.valueOf(iI0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair y0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair pairZ = Z(DelimitedRangesSequence, list, i10, z10, false);
        if (pairZ != null) {
            return Ad.v.a(pairZ.c(), Integer.valueOf(((String) pairZ.d()).length()));
        }
        return null;
    }

    public static final boolean z0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!kotlin.text.a.c(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }
}
