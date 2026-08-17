package expo.modules.notifications.service;

import Ad.j;
import Qc.a;
import Rc.h;
import Sc.b;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.T;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001b\u0010\u0013\u001a\u00020\u000e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/T;", "remoteMessage", "", "onMessageReceived", "(Lcom/google/firebase/messaging/T;)V", "", "token", "onNewToken", "(Ljava/lang/String;)V", "onDeletedMessages", "LSc/b;", "a", "Lkotlin/Lazy;", "m", "()LSc/b;", "firebaseMessagingDelegate", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ExpoFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy firebaseMessagingDelegate = j.b(new a(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final h l(ExpoFirebaseMessagingService expoFirebaseMessagingService) {
        return new h(expoFirebaseMessagingService);
    }

    protected b m() {
        return (b) this.firebaseMessagingDelegate.getValue();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onDeletedMessages() {
        m().b();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(T remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        m().c(remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        m().a(token);
    }
}
