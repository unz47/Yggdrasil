# アルティメット防具 胴装備 追加要件

## 基本情報
```yaml
アイテムID: ultimate_chestplate
アイテム名（日本語）: アルティメットチェストプレート
アイテム名（英語）: Ultimate Chestplate
説明: アルティメットインゴットで作られた最強クラスの胴装備
```

## 防具タイプ
```yaml
防具タイプ: チェストプレート
```

## 防具特性
```yaml
# 素材ティア設定（アルティメット防具 頭装備と同一ティアを共有）
防御力: 8  # チェストプレート枠（ネザライト=8）
タフネス: 4.0  # ネザライト(3.0)を超える最上位
ノックバック耐性: 0.15  # ネザライト(0.1)を超える
耐久値: 592  # チェストプレート基準（ネザライト=592相当、それ以上を想定）

# 参考値（バニラ チェストプレート）
# 革: 防御3, 耐久80
# 鉄: 防御6, 耐久240
# ダイヤ: 防御8, タフネス2.0, 耐久528
# ネザライト: 防御8, タフネス3.0, ノックバック0.1, 耐久592

エンチャント適性: 20  # ネザライト(15)を超える高適性
```

## 防具セット効果（任意）
```yaml
セット効果: なし
```

## クリエイティブタブ
```yaml
タブ: Yggdrasil_戦闘
```

## クラフトレシピ
```yaml
クラフトレシピ: あり
レシピタイプ: 作業台（有形）

パターン:
  行1: [ultimate_ingot, air, ultimate_ingot]
  行2: [ultimate_ingot, ultimate_ingot, ultimate_ingot]
  行3: [ultimate_ingot, ultimate_ingot, ultimate_ingot]

結果: ultimate_chestplate x 1
```

## 修繕
```yaml
修繕可能: Yes
修繕材料: ultimate_ingot
```

## テクスチャ
```yaml
# アイテムテクスチャ
アイテムテクスチャ: ultimate_chestplate.png
テクスチャパス: textures/item/armor/ultimate_chestplate.png

# 装備時テクスチャ（ヘルメット・チェスト・ブーツ共通のlayer_1を使用）
防具テクスチャレイヤー1: ultimate_layer_1.png  # ヘルメット/チェスト/ブーツ用（既存を共有）
防具テクスチャレイヤー2: ultimate_layer_2.png  # レギンス用（既存を共有）

テクスチャサイズ:
  - アイテム: 16x16
  - 防具レイヤー: 64x32
```

## 特殊機能
```yaml
特殊能力: なし
耐火性: Yes  # アルティメット級は溶岩で燃えない
```

## 希少度
```yaml
希少度: Common
```

---

## 実装指示

上記のアルティメットチェストプレートを実装してください。

必要なファイル:
1. UltimateArmorMaterial.java - 防具マテリアル定義（頭装備で作成済みの場合は共有・チェストプレート防御力の確認）
2. ArmorItems.java - アイテム登録（ULTIMATE_CHESTPLATE追加）
3. ModCreativeTabs.java - 戦闘タブに追加
4. assets/yggdrasil/models/item/ultimate_chestplate.json
5. assets/yggdrasil/textures/item/armor/ultimate_chestplate.png
6. assets/yggdrasil/textures/models/armor/ultimate_layer_1.png（既存を共有、なければ作成）
7. assets/yggdrasil/textures/models/armor/ultimate_layer_2.png（既存を共有、なければ作成）
8. assets/yggdrasil/lang/ja_jp.json, en_us.json（翻訳追加）
9. data/yggdrasil/recipes/armor/ultimate_chestplate.json

前提: ultimate_ingot および ultimate_helmet（アルティメット防具 頭装備）が既に実装済み。防具マテリアル（UltimateArmorMaterial）は頭装備実装時に作成済みのものを共有する。
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
