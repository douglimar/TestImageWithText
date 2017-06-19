package br.com.ddmsoftware.testimagewithtext;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static android.R.attr.bitmap;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.myButton);
        button.setText("Clica Aqui!");

        imageView = (ImageView)findViewById(R.id.myImageView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Hello World.", Toast.LENGTH_LONG).show();

                //writeOnDrawable(R.drawable.dog, "TESTES TESTE TESTE");
                //imageView.setImageResource(R.drawable.dog);

                //imageView.setImageDrawable(writeOnDrawable(R.drawable.dog, "TESTES TESTE TESTE"));

                imageView.setImageBitmap(drawTextOnBitmap(getApplication().getBaseContext(),R.drawable.dog, "SOCORRO!!!!!!!!!!!!!"));
                Toast.makeText(getBaseContext(), "Carrega ImageNS.", Toast.LENGTH_LONG).show();

            }
        });
    }

    public BitmapDrawable writeOnDrawable(int pDrawableId, String pText) {

        Bitmap bm = BitmapFactory.decodeResource(getResources(), pDrawableId).copy(Bitmap.Config.ARGB_8888, true);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        paint.setTextSize(20);

        Canvas canvas = new Canvas(bm);
        canvas.drawText(pText, 0, bm.getHeight()/2, paint);

        return new BitmapDrawable(bm);

/*
        BitmapDrawable (Resources res, Bitmap bitmap){
            return new BitmapDrawable(getBaseContext().getResources(), bm);

        } */
    }


    public Bitmap drawTextOnBitmap(Context context, int resId, String text) {

        // prepare canvas
        Resources resources = context.getResources();
        float scale = resources.getDisplayMetrics().density;
        Bitmap bitmap = BitmapFactory.decodeResource(resources, resId);

        android.graphics.Bitmap.Config bitmapConfig = bitmap.getConfig();
        // set default bitmap config if none
        if (bitmapConfig == null) {
            bitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
        }
        // resource bitmaps are immutable, so we need to convert it to mutable one
        bitmap = bitmap.copy(bitmapConfig, true);
        Canvas canvas = new Canvas(bitmap);

        // new antialiased Paint
        TextPaint paint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        // text color - #3D3D3D
        paint.setColor(Color.rgb(61, 61, 61));
        // text size in pixels
        paint.setTextSize((int) (bitmap.getHeight() / 10 * scale));
        // text shadow
        paint.setShadowLayer(1f, 0f, 1f, Color.WHITE);

        // set text width to canvas width minus 16dp padding
        int textWidth = canvas.getWidth() - (int) (16 * scale);

        // init StaticLayout for text
        StaticLayout textLayout = new StaticLayout(text, paint, textWidth,
                Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);

        // get height of multiline text
        int textHeight = textLayout.getHeight();

        // get position of text's top left corner
        float x = (bitmap.getWidth() - textWidth) / 2;
        float y = (bitmap.getHeight() - textHeight) / 2;

        // draw text to the Canvas center
        canvas.save();
        canvas.translate(x, y);
        textLayout.draw(canvas);
        canvas.restore();

        return bitmap;
    }
}
