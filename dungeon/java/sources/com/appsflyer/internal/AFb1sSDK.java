package com.appsflyer.internal;

import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFh1mSDK;", "event", "", "rawData", "<init>", "(Lcom/appsflyer/internal/AFh1mSDK;[B)V", "", "afInfoLog", "()V", "AFAdRevenueData", "Lcom/appsflyer/internal/AFh1mSDK;", "getCurrencyIso4217Code", "getRevenue", "[B"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFb1sSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private final AFh1mSDK getCurrencyIso4217Code;

    @Nullable
    private final byte[] getRevenue;

    public AFb1sSDK(@NotNull AFh1mSDK aFh1mSDK, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        this.getCurrencyIso4217Code = aFh1mSDK;
        this.getRevenue = bArr;
    }

    public final void afInfoLog() throws Throwable {
        try {
            Map map = AFa1hSDK.f28450d;
            Object declaredConstructor = map.get(-1994295490);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1hSDK.getRevenue((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 88, (char) (58271 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getDeclaredConstructor(null);
                map.put(-1994295490, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.getCurrencyIso4217Code, this.getRevenue};
            Object method = map.get(2113693083);
            if (method == null) {
                method = ((Class) AFa1hSDK.getRevenue(136 - AndroidCharacter.getMirror('0'), (char) (58271 - (ViewConfiguration.getPressedStateDuration() >> 16)), 37 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("getMonetizationNetwork", AFh1mSDK.class, byte[].class);
                map.put(2113693083, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
