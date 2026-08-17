package p294q6;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public class B extends AbstractC4070b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f51471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f51472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f51473h;

    public B(ReadableMap readableMap) {
        this.f51471f = readableMap != null ? readableMap.getDouble("value") : Double.NaN;
        this.f51472g = readableMap != null ? readableMap.getDouble("offset") : 0.0d;
    }

    public /* synthetic */ B(ReadableMap readableMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : readableMap);
    }

    @Override // p294q6.AbstractC4070b
    public String e() {
        return "ValueAnimatedNode[" + this.f51480d + "]: value: " + this.f51471f + " offset: " + this.f51472g;
    }

    public final void i() {
        this.f51472g += this.f51471f;
        this.f51471f = 0.0d;
    }

    public final void j() {
        this.f51471f += this.f51472g;
        this.f51472g = 0.0d;
    }

    public Object k() {
        return null;
    }

    public final double l() {
        if (Double.isNaN(this.f51472g + this.f51471f)) {
            h();
        }
        return this.f51472g + this.f51471f;
    }

    public final void m() {
        c cVar = this.f51473h;
        if (cVar != null) {
            double dL = l();
            double d10 = this.f51472g;
            cVar.a(dL - d10, d10);
        }
    }

    public final void n(c cVar) {
        this.f51473h = cVar;
    }
}
