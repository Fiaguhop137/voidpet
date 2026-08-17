package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC3940b;
import kotlin.collections.AbstractC3942d;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
final class h implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matcher f48534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f48535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f48536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f48537d;

    public static final class a extends AbstractC3942d {
        a() {
        }

        @Override // kotlin.collections.AbstractC3940b
        public int c() {
            return h.this.f().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return g((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean g(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.AbstractC3942d, java.util.List
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = h.this.f().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int i(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.AbstractC3942d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return i((String) obj);
            }
            return -1;
        }

        public /* bridge */ int k(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.AbstractC3942d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return k((String) obj);
            }
            return -1;
        }
    }

    public static final class b extends AbstractC3940b implements g {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MatchGroup i(b bVar, int i10) {
            return bVar.get(i10);
        }

        @Override // kotlin.collections.AbstractC3940b
        public int c() {
            return h.this.f().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return h((MatchGroup) obj);
            }
            return false;
        }

        @Override // kotlin.text.g
        public MatchGroup get(int i10) {
            IntRange intRangeH = j.h(h.this.f(), i10);
            if (intRangeH.c().intValue() < 0) {
                return null;
            }
            String strGroup = h.this.f().group(i10);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            return new MatchGroup(strGroup, intRangeH);
        }

        public /* bridge */ boolean h(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // kotlin.collections.AbstractC3940b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return kotlin.sequences.k.N(CollectionsKt.Z(CollectionsKt.m(this)), new i(this)).iterator();
        }
    }

    public h(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f48534a = matcher;
        this.f48535b = input;
        this.f48536c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult f() {
        return this.f48534a;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult.b a() {
        return MatchResult.a.a(this);
    }

    @Override // kotlin.text.MatchResult
    public List b() {
        if (this.f48537d == null) {
            this.f48537d = new a();
        }
        List list = this.f48537d;
        Intrinsics.c(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public IntRange c() {
        return j.g(f());
    }

    @Override // kotlin.text.MatchResult
    public g d() {
        return this.f48536c;
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String strGroup = f().group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        int iEnd = f().end() + (f().end() == f().start() ? 1 : 0);
        if (iEnd > this.f48535b.length()) {
            return null;
        }
        Matcher matcher = this.f48534a.pattern().matcher(this.f48535b);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return j.e(matcher, iEnd, this.f48535b);
    }
}
