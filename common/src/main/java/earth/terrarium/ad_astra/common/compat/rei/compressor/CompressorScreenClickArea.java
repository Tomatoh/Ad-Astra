package earth.terrarium.ad_astra.common.compat.rei.compressor;

import earth.terrarium.ad_astra.client.screen.CompressorScreen;
import earth.terrarium.ad_astra.common.compat.rei.BaseClickArea;
import earth.terrarium.ad_astra.common.compat.rei.REICategories;

import java.awt.*;

public class CompressorScreenClickArea extends BaseClickArea<CompressorScreen> {

	@Override
	public Rectangle getBounds(CompressorScreen screen) {
		return screen.getHammerBounds();
	}

	@Override
	public Result getSuccess(CompressorScreen screen) {
		return categoryWithTooltip(REICategories.COMPRESSOR_CATEGORY, screen.getHammerTooltip());
	}
}
