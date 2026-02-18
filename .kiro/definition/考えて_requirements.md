

# アルティメットヘルメット追加要件

## 基本情報
```yaml
アイテムID: ultimate_helmet
アイテム名（日本語）: アルティメットヘルメット
アイテム名（英語）: Ultimate Helmet
説明: アダマンタイトとミスリルを組み合わせた究極のヘルメット
```

## 防具タイプ
```yaml
防具タイプ: ヘルメット
```

## 防具特性
```yaml
# 素材ティア設定（ネザライトの2倍）
防御力: 6
タフネス: 6.0
ノックバック耐性: 0.2
耐久値: 814

# 参考値（バニラ）
# ダイヤ: 防御3, タフネス2.0, ノックバック0.0, 耐久363
# ネザライト: 防御3, タフネス3.0, ノックバック0.1, 耐久407

エンチャント適性: 15
```

## 初期エンチャント
```yaml
# クラフト時に最初から付与されるエンチャント
初期エンチャント:
  - 防護IV (Protection IV)
  - 耐久力III (Unbreaking III)
  - 水中呼吸III (Respiration III)
  - 水中採掘I (Aqua Affinity I)
```

## 防具セット効果
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
  行1: [adamantite_ingot, adamantite_ingot, adamantite_ingot]
  行2: [mythril_ingot, air, mythril_ingot]
  行3: [air, air, air]
```

## 修繕
```yaml
修繕可能: Yes
修繕材料: adamantite_ingot
```

## テクスチャ
```yaml
# アイテムテクスチャ
アイテムテクスチャ: ultimate_helmet.png
テクスチャパス: textures/item/armor/ultimate_helmet.png

# 装備時テクスチャ（2レイヤー）
防具テクスチャレイヤー1: ultimate_layer_1.png  # ヘルメット/チェスト/ブーツ用
防具テクスチャレイヤー2: ultimate_layer_2.png  # レギンス用

テクスチャサイズ:
  - アイテム: 16x16
  - 防具レイヤー: 64x32
```

## 特殊機能
```yaml
特殊能力: なし
耐火性: No
```

## 希少度
```yaml
希少度: Common
```

---

## 実装指示

上記のアルティメットヘルメットを実装してください。

必要なファイル:
1. UltimateArmorMaterial.java - 防具マテリアル定義クラス（既存があれば追加）
2. ArmorItems.java - 防具アイテム登録（ULTIMATE_HELMET追加）
3. ModCreativeTabs.java - 戦闘タブに追加
4. assets/yggdrasil/models/item/ultimate_helmet.json
5. assets/yggdrasil/textures/item/armor/ultimate_helmet.png
6. assets/yggdrasil/textures/models/armor/ultimate_layer_1.png
7. assets/yggdrasil/textures/models/armor/ultimate_layer_2.png
8. assets/yggdrasil/lang/ja_jp.json, en_us.json（翻訳追加）
9. data/yggdrasil/recipes/armor/ultimate_helmet.json

前提: adamantite_ingot および mythril_ingot が既に実装済み
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
