package expo.modules.notifications.service;

import Ic.a;
import Ic.b;
import Ic.c;
import Ic.g;
import Ic.h;
import Ic.j;
import Ic.l;
import Rc.e;
import Sc.d;
import Y0.u;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0016J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u001f\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u001bJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u001bJ\u001f\u0010$\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\u001bJ\u001f\u0010%\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\u001bJ\u001f\u0010&\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0016J\u001f\u0010'\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u0016J\u001f\u0010(\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0016J\u001f\u0010)\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010\u0016J\u001f\u0010*\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0016¨\u0006,"}, d2 = {"Lexpo/modules/notifications/service/NotificationsService;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "LSc/d;", "d", "(Landroid/content/Context;)LSc/d;", "LSc/c;", "c", "(Landroid/content/Context;)LSc/c;", "LSc/a;", "b", "(Landroid/content/Context;)LSc/a;", "LSc/e;", "e", "(Landroid/content/Context;)LSc/e;", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "f", "p", "Landroid/os/Bundle;", "j", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;", "i", "h", "r", "s", "o", "l", "w", "g", "k", "m", "v", "n", "u", "t", "x", "a", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class NotificationsService extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f41104b = CollectionsKt.o("android.intent.action.BOOT_COMPLETED", "android.intent.action.REBOOT", "android.intent.action.MY_PACKAGE_REPLACED", "android.intent.action.QUICKBOOT_POWERON", "com.htc.intent.action.QUICKBOOT_POWERON");

    /* JADX INFO: renamed from: expo.modules.notifications.service.NotificationsService$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object C(Parcelable.Creator creator, byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            try {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                Object objCreateFromParcel = creator.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                return objCreateFromParcel;
            } catch (Exception e10) {
                Log.e("expo-notifications", "Could not unmarshall NotificationResponse from Intent.extra.", e10);
                return null;
            }
        }

        private final byte[] p(Parcelable parcelable) {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
            parcelable.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            Intrinsics.checkNotNullExpressionValue(bArrMarshall, "marshall(...)");
            parcelObtain.recycle();
            return bArrMarshall;
        }

        public static /* synthetic */ void r(Companion companion, Context context, a aVar, NotificationBehaviorRecord notificationBehaviorRecord, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                notificationBehaviorRecord = null;
            }
            if ((i10 & 8) != 0) {
                resultReceiver = null;
            }
            companion.q(context, aVar, notificationBehaviorRecord, resultReceiver);
        }

        public static /* synthetic */ void t(Companion companion, Context context, a aVar, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.s(context, aVar, resultReceiver);
        }

        public static /* synthetic */ void w(Companion companion, Context context, String str, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.v(context, str, resultReceiver);
        }

        public static /* synthetic */ void z(Companion companion, Context context, g gVar, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.y(context, gVar, resultReceiver);
        }

        public final void A(Context context, c category, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(category, "category");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("categories").appendPath(category.j()).build());
            intent.putExtra("type", "setCategory");
            intent.putExtra("notificationCategory", (Parcelable) category);
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void B(Intent intent, h notificationResponse) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(notificationResponse, "notificationResponse");
            try {
                Intrinsics.c(intent.putExtra(notificationResponse instanceof l ? "textInputNotificationResponse" : "notificationResponse", p(notificationResponse)));
            } catch (Exception e10) {
                Log.e("expo-notifications", "Could not marshal notification response: " + notificationResponse.j() + ".");
                e10.printStackTrace();
            }
        }

        public final Intent a(Context context, Intent intent) {
            b bVar;
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle extras = intent != null ? intent.getExtras() : null;
            a aVar = extras != null ? (a) extras.getParcelable("notification") : null;
            b bVar2 = extras != null ? (b) extras.getParcelable("notificationAction") : null;
            if (aVar == null || bVar2 == null) {
                throw new IllegalArgumentException("notification (" + aVar + ") and action (" + bVar2 + ") should not be null");
            }
            Bundle bundleO = u.o(intent);
            String string = bundleO != null ? bundleO.getString("userTextResponse") : null;
            boolean z10 = string != null && (bVar2 instanceof j);
            if (z10) {
                j jVar = (j) bVar2;
                bVar = new j(jVar.f(), jVar.getTitle(), false, jVar.k());
            } else {
                bVar = new b(bVar2.f(), bVar2.getTitle(), false);
            }
            Intent intent2 = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath(aVar.f().j()).appendPath("actions").appendPath(bVar.f()).build());
            ActivityInfo activityInfoH = NotificationsService.INSTANCE.h(context, intent2);
            if (activityInfoH != null) {
                intent2.setComponent(new ComponentName(activityInfoH.packageName, activityInfoH.name));
            }
            intent2.putExtra("type", "receiveResponse");
            intent2.putExtra("notification", aVar);
            intent2.putExtra("notificationAction", (Parcelable) bVar);
            if (z10) {
                u uVarA = new u.e("userTextResponse").a();
                Intrinsics.checkNotNullExpressionValue(uVarA, "build(...)");
                Bundle bundle = new Bundle();
                bundle.putString("userTextResponse", string);
                u.b(new u[]{uVarA}, intent2, bundle);
            }
            return intent2;
        }

        public final PendingIntent b(Context context, a notification, b action) {
            String className;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(notification, "notification");
            Intrinsics.checkNotNullParameter(action, "action");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath(notification.f().j()).appendPath("actions").appendPath(action.f()).build());
            ActivityInfo activityInfoH = NotificationsService.INSTANCE.h(context, intent);
            if (activityInfoH != null) {
                intent.setComponent(new ComponentName(activityInfoH.packageName, activityInfoH.name));
            }
            intent.putExtra("type", "receiveResponse");
            intent.putExtra("notification", notification);
            intent.putExtra("notificationAction", (Parcelable) action);
            if (action.j() && Build.VERSION.SDK_INT >= 31) {
                return Rc.c.f10988b.b(context, intent);
            }
            int i10 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
            ComponentName component = intent.getComponent();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, (component == null || (className = component.getClassName()) == null) ? NotificationsService.class.hashCode() : className.hashCode(), intent, i10 | 134217728);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final PendingIntent c(Context context, String identifier) {
            String className;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("scheduled").appendPath(identifier).appendPath("trigger").build());
            ActivityInfo activityInfoH = NotificationsService.INSTANCE.h(context, intent);
            if (activityInfoH != null) {
                intent.setComponent(new ComponentName(activityInfoH.packageName, activityInfoH.name));
            }
            intent.putExtra("type", "trigger");
            intent.putExtra("identifier", identifier);
            int i10 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
            ComponentName component = intent.getComponent();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, (component == null || (className = component.getClassName()) == null) ? NotificationsService.class.hashCode() : className.hashCode(), intent, i10 | 134217728);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final void d(Context context, String identifier, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("categories").appendPath(identifier).build());
            intent.putExtra("type", "deleteCategory");
            intent.putExtra("identifier", identifier);
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void e(Context context, String[] identifiers, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(identifiers, "identifiers");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("dismiss").build());
            intent.putExtra("type", "dismissSelected");
            intent.putExtra("identifiers", identifiers);
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void f(Context context, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("dismiss").build());
            intent.putExtra("type", "dismissAll");
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void g(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            ActivityInfo activityInfoH = h(context, intent);
            if (activityInfoH != null) {
                intent.setComponent(new ComponentName(activityInfoH.packageName, activityInfoH.name));
                context.sendBroadcast(intent);
                return;
            }
            Log.e("expo-notifications", "No service capable of handling notifications found (intent = " + intent.getAction() + "). Ensure that you have configured your AndroidManifest.xml properly.");
        }

        @Nullable
        public final h getNotificationResponseFromOpenIntent(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            byte[] byteArrayExtra = intent.getByteArrayExtra("notificationResponse");
            if (byteArrayExtra != null) {
                Companion companion = NotificationsService.INSTANCE;
                Parcelable.Creator<h> CREATOR = h.CREATOR;
                Intrinsics.checkNotNullExpressionValue(CREATOR, "CREATOR");
                return (h) companion.C(CREATOR, byteArrayExtra);
            }
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("textInputNotificationResponse");
            if (byteArrayExtra2 == null) {
                return null;
            }
            Companion companion2 = NotificationsService.INSTANCE;
            Parcelable.Creator<l> CREATOR2 = l.CREATOR;
            Intrinsics.checkNotNullExpressionValue(CREATOR2, "CREATOR");
            return (h) companion2.C(CREATOR2, byteArrayExtra2);
        }

        public final void getScheduledNotification(@NotNull Context context, @NotNull String identifier, @Nullable ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("scheduled").appendPath(identifier).build());
            intent.putExtra("type", "getScheduled");
            intent.putExtra("identifier", identifier);
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final ActivityInfo h(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intent intent2 = new Intent(intent.getAction()).setPackage(context.getPackageName());
            Intrinsics.checkNotNullExpressionValue(intent2, "setPackage(...)");
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryBroadcastReceivers, "queryBroadcastReceivers(...)");
            ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull(listQueryBroadcastReceivers);
            if (resolveInfo != null) {
                return resolveInfo.activityInfo;
            }
            return null;
        }

        public final void i(Context context, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().build());
            intent.putExtra("type", "getAllDisplayed");
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void j(Context context, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT");
            intent.putExtra("type", "getAllScheduled");
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void k(Context context, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("categories").build());
            intent.putExtra("type", "getCategories");
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final h l(Intent intent) {
            String string;
            Intrinsics.checkNotNullParameter(intent, "intent");
            a aVar = (a) intent.getParcelableExtra("notification");
            if (aVar == null) {
                throw new IllegalArgumentException("notification not found in the intent extras.");
            }
            b bVar = (b) intent.getParcelableExtra("notificationAction");
            if (bVar == null) {
                throw new IllegalArgumentException("notificationAction not found in the intent extras.");
            }
            if (!(bVar instanceof j)) {
                return new h(bVar, aVar);
            }
            Bundle bundleO = u.o(intent);
            if (bundleO == null || (string = bundleO.getString("userTextResponse")) == null) {
                string = "";
            }
            return new l(bVar, aVar, string);
        }

        protected final Uri.Builder m() {
            Uri.Builder builderBuildUpon = Uri.parse("expo-notifications://notifications/").buildUpon();
            Intrinsics.checkNotNullExpressionValue(builderBuildUpon, "buildUpon(...)");
            return builderBuildUpon;
        }

        protected final Uri.Builder n(String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Uri.Builder builderAppendPath = m().appendPath(identifier);
            Intrinsics.checkNotNullExpressionValue(builderAppendPath, "appendPath(...)");
            return builderAppendPath;
        }

        public final void o(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT");
            intent.putExtra("type", "dropped");
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void q(Context context, a notification, NotificationBehaviorRecord notificationBehaviorRecord, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(notification, "notification");
            String strJ = notification.f().j();
            Intrinsics.checkNotNullExpressionValue(strJ, "getIdentifier(...)");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", n(strJ).appendPath("present").build());
            intent.putExtra("type", "present");
            intent.putExtra("notification", notification);
            intent.putExtra("notificationBehavior", notificationBehaviorRecord);
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void s(Context context, a notification, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(notification, "notification");
            String strJ = notification.f().j();
            Intrinsics.checkNotNullExpressionValue(strJ, "getIdentifier(...)");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", n(strJ).appendPath("receive").build());
            intent.putExtra("type", "receive");
            intent.putExtra("notification", notification);
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void u(Context context, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT");
            intent.putExtra("type", "removeAll");
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void v(Context context, String identifier, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            x(context, CollectionsKt.e(identifier), resultReceiver);
        }

        public final void x(Context context, Collection identifiers, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(identifiers, "identifiers");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("scheduled").build());
            intent.putExtra("type", "removeSelected");
            intent.putExtra("identifiers", (String[]) identifiers.toArray(new String[0]));
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }

        public final void y(Context context, g notificationRequest, ResultReceiver resultReceiver) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(notificationRequest, "notificationRequest");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("scheduled").appendPath(notificationRequest.j()).build());
            intent.putExtra("type", "schedule");
            intent.putExtra("notificationRequest", (Parcelable) notificationRequest);
            intent.putExtra("receiver", resultReceiver);
            Unit unit = Unit.f48228a;
            g(context, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Intent intent, BroadcastReceiver.PendingResult pendingResult, NotificationsService notificationsService, Context context) {
        if (intent != null) {
            try {
                notificationsService.f(context, intent);
            } finally {
                pendingResult.finish();
            }
        }
        return Unit.f48228a;
    }

    protected Sc.a b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Rc.b(context);
    }

    protected Sc.c c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Rc.c(context);
    }

    protected d d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new e(context, null, 2, null);
    }

    protected Sc.e e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Rc.g(context);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x011d A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:16:0x003b, B:18:0x0043, B:19:0x0047, B:21:0x004c, B:23:0x0054, B:72:0x011d, B:26:0x005d, B:28:0x0065, B:29:0x006a, B:31:0x0072, B:32:0x0077, B:34:0x007f, B:35:0x0084, B:37:0x008c, B:38:0x0092, B:40:0x009a, B:41:0x009f, B:43:0x00a7, B:44:0x00ad, B:46:0x00b5, B:47:0x00b9, B:49:0x00c1, B:50:0x00c5, B:52:0x00cd, B:53:0x00d1, B:55:0x00d9, B:56:0x00dd, B:58:0x00e5, B:59:0x00e9, B:61:0x00f1, B:62:0x00f6, B:64:0x00fe, B:65:0x0103, B:67:0x010b, B:68:0x0110, B:70:0x0118, B:74:0x0124, B:75:0x013d), top: B:82:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void f(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (CollectionsKt.b0(f41104b, intent.getAction())) {
            x(context, intent);
            return;
        }
        if (intent.getAction() != "expo.modules.notifications.NOTIFICATION_EVENT") {
            throw new IllegalArgumentException("Received intent of unrecognized action: " + intent.getAction() + ". Ignoring.");
        }
        Bundle extras = intent.getExtras();
        Bundle bundleG = null;
        Object obj = extras != null ? extras.get("receiver") : null;
        ResultReceiver resultReceiver = obj instanceof ResultReceiver ? (ResultReceiver) obj : null;
        try {
            String stringExtra = intent.getStringExtra("type");
            if (stringExtra != null) {
                switch (stringExtra.hashCode()) {
                    case -2144315324:
                        if (stringExtra.equals("receiveResponse")) {
                            s(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case -2002465847:
                        if (stringExtra.equals("deleteCategory")) {
                            bundleG = g(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit2 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case -1734918526:
                        if (stringExtra.equals("getAllScheduled")) {
                            bundleG = k(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit3 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case -1326613834:
                        if (stringExtra.equals("getAllDisplayed")) {
                            bundleG = j(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit4 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case -1059891784:
                        if (stringExtra.equals("trigger")) {
                            n(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit5 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case -697920873:
                        if (stringExtra.equals("schedule")) {
                            v(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit6 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case -577380539:
                        if (stringExtra.equals("dismissSelected")) {
                            i(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit7 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case -402879681:
                        if (stringExtra.equals("removeSelected")) {
                            u(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit8 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case -318277445:
                        if (stringExtra.equals("present")) {
                            p(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit9 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case -170315273:
                        if (stringExtra.equals("getScheduled")) {
                            bundleG = m(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit10 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case 648465079:
                        if (stringExtra.equals("dismissAll")) {
                            h(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit11 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case 998768146:
                        if (stringExtra.equals("getCategories")) {
                            bundleG = l(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit12 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case 1082290915:
                        if (stringExtra.equals("receive")) {
                            r(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit13 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case 1282345597:
                        if (stringExtra.equals("removeAll")) {
                            t(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit14 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case 1925736384:
                        if (stringExtra.equals("dropped")) {
                            o(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit15 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    case 2039831424:
                        if (stringExtra.equals("setCategory")) {
                            bundleG = w(context, intent);
                            if (resultReceiver != null) {
                                resultReceiver.send(0, bundleG);
                                Unit unit16 = Unit.f48228a;
                                return;
                            }
                            return;
                        }
                        break;
                    default:
                        break;
                }
            }
            throw new IllegalArgumentException("Received event of unrecognized type: " + stringExtra + ". Ignoring.");
        } catch (Exception e10) {
            Log.e("expo-notifications", "Action " + intent.getAction() + " failed: " + e10.getMessage());
            e10.printStackTrace();
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("exception", e10);
                Unit unit17 = Unit.f48228a;
                resultReceiver.send(1, bundle);
            }
        }
    }

    public Bundle g(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundle = new Bundle();
        Sc.a aVarB = b(context);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("identifier") : null;
        Intrinsics.c(string);
        bundle.putBoolean("succeeded", aVarB.b(string));
        return bundle;
    }

    public void h(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        d(context).d();
    }

    public void i(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        d dVarD = d(context);
        Bundle extras = intent.getExtras();
        String[] stringArray = extras != null ? extras.getStringArray("identifiers") : null;
        Intrinsics.c(stringArray);
        dVarD.b(AbstractC3952n.e(stringArray));
    }

    public Bundle j(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("notifications", new ArrayList<>(d(context).c()));
        return bundle;
    }

    public Bundle k(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("notificationRequests", new ArrayList<>(e(context).f()));
        return bundle;
    }

    public Bundle l(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("notificationCategories", new ArrayList<>(b(context).c()));
        return bundle;
    }

    public Bundle m(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundle = new Bundle();
        Sc.e eVarE = e(context);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("identifier") : null;
        Intrinsics.c(string);
        bundle.putParcelable("notificationRequest", eVarE.e(string));
        return bundle;
    }

    public void n(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Sc.e eVarE = e(context);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("identifier") : null;
        Intrinsics.c(string);
        eVarE.a(string);
    }

    public void o(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        c(context).a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Dd.a.b(false, false, null, null, 0, new Qc.b(intent, goAsync(), this, context), 31, null);
    }

    public void p(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        d dVarD = d(context);
        Bundle extras = intent.getExtras();
        a aVar = extras != null ? (a) extras.getParcelable("notification") : null;
        Intrinsics.c(aVar);
        Bundle extras2 = intent.getExtras();
        dVarD.a(aVar, extras2 != null ? (NotificationBehaviorRecord) extras2.getParcelable("notificationBehavior") : null);
    }

    public void r(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Sc.c cVarC = c(context);
        Parcelable parcelableExtra = intent.getParcelableExtra("notification");
        Intrinsics.c(parcelableExtra);
        cVarC.c((a) parcelableExtra);
    }

    public void s(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        c(context).b(INSTANCE.l(intent));
    }

    public void t(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        e(context).c();
    }

    public void u(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Sc.e eVarE = e(context);
        Bundle extras = intent.getExtras();
        String[] stringArray = extras != null ? extras.getStringArray("identifiers") : null;
        Intrinsics.c(stringArray);
        eVarE.d(AbstractC3952n.e(stringArray));
    }

    public void v(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Sc.e eVarE = e(context);
        Bundle extras = intent.getExtras();
        g gVar = extras != null ? (g) extras.getParcelable("notificationRequest") : null;
        Intrinsics.c(gVar);
        eVarE.g(gVar);
    }

    public Bundle w(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundle = new Bundle();
        Sc.a aVarB = b(context);
        Parcelable parcelableExtra = intent.getParcelableExtra("notificationCategory");
        Intrinsics.c(parcelableExtra);
        bundle.putParcelable("notificationCategory", aVarB.a((c) parcelableExtra));
        return bundle;
    }

    public void x(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        e(context).b();
    }
}
