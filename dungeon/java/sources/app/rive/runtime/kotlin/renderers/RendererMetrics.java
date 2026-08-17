package app.rive.runtime.kotlin.renderers;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.FrameMetrics;
import android.view.Window;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lapp/rive/runtime/kotlin/renderers/RendererMetrics;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "allFrames", "", "jankyFrames", "refreshRateMs", "", "sampleCount", "totalTime", "Ljava/math/BigDecimal;", "onFrameMetricsAvailable", "", "window", "Landroid/view/Window;", "frameMetrics", "Landroid/view/FrameMetrics;", "dropCountSinceLastInvocation", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RendererMetrics implements Window.OnFrameMetricsAvailableListener {
    private static final double ONE_MS_IN_NS = 1000000.0d;
    public static final int SAMPLES = 30;

    @NotNull
    private static final String TAG = "RendererMetrics";
    private int allFrames;
    private int jankyFrames;
    private final float refreshRateMs;
    private int sampleCount;

    @NotNull
    private BigDecimal totalTime;
    public static final int $stable = 8;

    public RendererMetrics(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.totalTime = new BigDecimal(0.0d);
        Window window = activity.getWindow();
        float refreshRate = Build.VERSION.SDK_INT >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        J j10 = J.f48342a;
        String str = String.format("Refresh rate: %.1f Hz", Arrays.copyOf(new Object[]{Float.valueOf(refreshRate)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Log.i("RendererMetrics", str);
        this.refreshRateMs = 1000 / refreshRate;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(@Nullable Window window, @Nullable FrameMetrics frameMetrics, int dropCountSinceLastInvocation) {
        if (window == null) {
            Log.w("RendererMetrics", "Invalid Window reference");
            return;
        }
        if (frameMetrics == null) {
            Log.w("RendererMetrics", "Invalid FrameMetrics reference");
            return;
        }
        FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
        this.allFrames++;
        this.sampleCount++;
        double metric = frameMetrics2.getMetric(8) / 1000000.0d;
        BigDecimal bigDecimalAdd = this.totalTime.add(new BigDecimal(String.valueOf(metric)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        this.totalTime = bigDecimalAdd;
        if (bigDecimalAdd.compareTo(new BigDecimal(String.valueOf(this.refreshRateMs))) > 0) {
            this.jankyFrames++;
        }
        if (this.sampleCount == 30) {
            this.sampleCount = 0;
            double metric2 = frameMetrics2.getMetric(4) / 1000000.0d;
            double metric3 = frameMetrics2.getMetric(7) / 1000000.0d;
            double metric4 = frameMetrics2.getMetric(6) / 1000000.0d;
            Locale locale = Locale.US;
            Double dValueOf = Double.valueOf(metric);
            Double dValueOf2 = Double.valueOf(metric2);
            Double dValueOf3 = Double.valueOf(metric3);
            Double dValueOf4 = Double.valueOf(metric4);
            BigDecimal bigDecimal = this.totalTime;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.allFrames);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            Log.i("RendererMetrics", String.format(locale, "\\n\n============ FrameMetrics ============\n=== Frame issued in:        %.2fms ===\n=== Draw Time:              %.2fms ===\n=== Swap Buffers Duration:  %.2fms ===\n=== GPU commands sent in:   %.2fms ===\n======================================\n=== Overall average:        %.2fms ===", dValueOf, dValueOf2, dValueOf3, dValueOf4, bigDecimal.divide(bigDecimalValueOf, 2, RoundingMode.HALF_UP)));
        }
    }
}
