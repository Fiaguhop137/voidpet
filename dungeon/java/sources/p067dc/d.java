package p067dc;

import Ad.n;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0442d f39904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f39905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f39906c;

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39907a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 728698842;
        }

        public String toString() {
            return "AllEventsFilter";
        }
    }

    public static abstract class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f39908a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.f39908a = event;
        }

        public final String a() {
            return this.f39908a;
        }
    }

    /* JADX INFO: renamed from: dc.d$d, reason: collision with other inner class name */
    public enum EnumC0442d {
        StartObserving("startObserving"),
        StopObserving("stopObserving");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f39912e = Gd.a.a(e());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f39913a;

        EnumC0442d(String str) {
            this.f39913a = str;
        }

        public static EnumEntries g() {
            return f39912e;
        }

        public final String h() {
            return this.f39913a;
        }
    }

    public d(EnumC0442d type, b filer, Function0 body) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(filer, "filer");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f39904a = type;
        this.f39905b = filer;
        this.f39906c = body;
    }

    public final void a(EnumC0442d eventType, String eventName) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (eventType == this.f39904a && b(eventName)) {
            this.f39906c.invoke();
        }
    }

    public final boolean b(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        b bVar = this.f39905b;
        if (bVar instanceof a) {
            return true;
        }
        if (bVar instanceof c) {
            return Intrinsics.b(((c) bVar).a(), eventName);
        }
        throw new n();
    }
}
