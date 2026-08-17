package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1gSDK {

    @NotNull
    final Intent getCurrencyIso4217Code;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "J_", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2<T> extends kotlin.jvm.internal.o implements Function0<T> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$AFAdRevenueData);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends kotlin.jvm.internal.o implements Function0<String> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.getStringExtra(this.$AFAdRevenueData);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getCurrencyIso4217Code", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends kotlin.jvm.internal.o implements Function0<Boolean> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1gSDK.this.getCurrencyIso4217Code.hasExtra(this.$getMonetizationNetwork));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "K_", "()Landroid/content/Intent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends kotlin.jvm.internal.o implements Function0<Intent> {
        private /* synthetic */ long $AFAdRevenueData;
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(String str, long j10) {
            super(0);
            this.$getMonetizationNetwork = str;
            this.$AFAdRevenueData = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.putExtra(this.$getMonetizationNetwork, this.$AFAdRevenueData);
        }
    }

    public AFj1gSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getCurrencyIso4217Code = intent;
    }

    private final <T> T getMediationNetwork(Function0<? extends T> function0, String str, T t10, boolean z10) {
        Object objB;
        Object objB2;
        Object mediationNetwork;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                Ad.q.a aVar = Ad.q.f327b;
                objB = Ad.q.b(function0.invoke());
            } catch (Throwable th) {
                Ad.q.a aVar2 = Ad.q.f327b;
                objB = Ad.q.b(Ad.r.a(th));
            }
            kotlin.reflect.d[] dVarArr = {kotlin.jvm.internal.F.b(ConcurrentModificationException.class), kotlin.jvm.internal.F.b(ArrayIndexOutOfBoundsException.class)};
            Throwable thD = Ad.q.d(objB);
            if (thD != null) {
                try {
                    if (!AbstractC3952n.M(dVarArr, kotlin.jvm.internal.F.b(thD.getClass()))) {
                        throw thD;
                    }
                    if (z10) {
                        mediationNetwork = getMediationNetwork(function0, str, t10, false);
                    } else {
                        AFLogger.afErrorLog(str, thD, false, false);
                        mediationNetwork = t10;
                    }
                    objB2 = Ad.q.b(mediationNetwork);
                    objB = objB2;
                } catch (Throwable th2) {
                    Ad.q.a aVar3 = Ad.q.f327b;
                    objB2 = Ad.q.b(Ad.r.a(th2));
                }
            }
            Throwable thD2 = Ad.q.d(objB);
            if (thD2 == null) {
                t10 = (T) objB;
            } else {
                AFLogger.afErrorLog(str, thD2, false, false);
            }
        }
        return t10;
    }

    @Nullable
    public final String AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getMediationNetwork(new AnonymousClass3(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    public final <T extends Parcelable> T H_(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getMediationNetwork(new AnonymousClass2(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    public final Intent I_(@NotNull String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getMediationNetwork(new AnonymousClass5(str, j10), "Error while trying to write " + str + " extra to intent", null, true);
    }

    public final boolean getMediationNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getMediationNetwork(new AnonymousClass4(str), "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
