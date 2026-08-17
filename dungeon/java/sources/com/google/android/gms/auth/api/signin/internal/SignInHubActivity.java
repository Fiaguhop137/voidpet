package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import p081e8.r;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class SignInHubActivity extends j {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static boolean f31649G = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f31650B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private SignInConfiguration f31651C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f31652D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f31653E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Intent f31654F;

    private final void q0(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f31651C);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f31650B = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            s0(17);
        }
    }

    private final void r0() {
        i0().c(0, null, new a(this, null));
        f31649G = false;
    }

    private final void s0(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f31649G = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    final /* synthetic */ int o0() {
        return this.f31653E;
    }

    @Override // androidx.fragment.app.j, p054d.j, android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f31650B) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.a4() != null) {
                GoogleSignInAccount googleSignInAccountA4 = signInAccount.a4();
                if (googleSignInAccountA4 == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    s0(12500);
                    return;
                }
                r.a(this).c(this.f31651C.a4(), googleSignInAccountA4);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountA4);
                this.f31652D = true;
                this.f31653E = i11;
                this.f31654F = intent;
                r0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                s0(intExtra);
                return;
            }
        }
        s0(8);
    }

    @Override // androidx.fragment.app.j, p054d.j, Y0.h, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            s0(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            s0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f31651C = signInConfiguration;
        if (bundle == null) {
            if (f31649G) {
                setResult(0);
                s0(12502);
                return;
            } else {
                f31649G = true;
                q0(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.f31652D = z10;
        if (z10) {
            this.f31653E = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 != null) {
                this.f31654F = intent2;
                r0();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f31649G = false;
    }

    @Override // p054d.j, Y0.h, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f31652D);
        if (this.f31652D) {
            bundle.putInt("signInResultCode", this.f31653E);
            bundle.putParcelable("signInResultData", this.f31654F);
        }
    }

    final /* synthetic */ Intent p0() {
        return this.f31654F;
    }
}
