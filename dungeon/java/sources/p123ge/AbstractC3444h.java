package p123ge;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p302qe.InterfaceC4073b;
import p464ze.f;

/* JADX INFO: renamed from: ge.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3444h implements InterfaceC4073b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f42381b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f42382a;

    /* JADX INFO: renamed from: ge.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC3444h a(Object value, f fVar) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (AbstractC3442f.l(value.getClass())) {
                return new v(fVar, (Enum) value);
            }
            if (value instanceof Annotation) {
                return new i(fVar, (Annotation) value);
            }
            if (value instanceof Object[]) {
                return new l(fVar, (Object[]) value);
            }
            return value instanceof Class ? new r(fVar, (Class) value) : new x(fVar, value);
        }
    }

    private AbstractC3444h(f fVar) {
        this.f42382a = fVar;
    }

    public /* synthetic */ AbstractC3444h(f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // p302qe.InterfaceC4073b
    public f getName() {
        return this.f42382a;
    }
}
