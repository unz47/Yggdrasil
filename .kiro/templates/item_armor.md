# 防具追加テンプレート

## 基本情報
```yaml
アイテムID: mythril_helmet
アイテム名（日本語）: ミスリルのヘルメット
アイテム名（英語）: Mythril Helmet
```

## 防具タイプ
```yaml
防具タイプ: ヘルメット  # ヘルメット/チェストプレート/レギンス/ブーツ
```

## 防具特性
```yaml
# 素材ティア設定
防御力: 3  # ヘルメット: 1-3, チェスト: 3-8, レギンス: 2-6, ブーツ: 1-3
タフネス: 2.0  # 0.0-3.0（高いほどダメージ軽減）
ノックバック耐性: 0.1  # 0.0-1.0（1.0で完全耐性）
耐久値: 363  # ヘルメット基準、他は倍率で調整

# 参考値（バニラ）
# 革: 防御5-11, 耐久55-80
# 鉄: 防御15, 耐久165-240
# ダイヤ: 防御20, タフネス2.0, 耐久363-528
# ネザライト: 防御20, タフネス3.0, ノックバック0.1, 耐久407-592

エンチャント適性: 9  # 高いほどエンチャントが良くなる
```

## 防具セット効果（任意）
```yaml
セット効果: なし
# 例: "フルセット装備時に移動速度上昇 II"
```

## クリエイティブタブ
```yaml
タブ: 戦闘
```

## クラフトレシピ
```yaml
クラフトレシピ: あり
レシピタイプ: 作業台（有形）

# ヘルメットのパターン
パターン:
  行1: [mythril_ingot, mythril_ingot, mythril_ingot]
  行2: [mythril_ingot, air, mythril_ingot]
  行3: [air, air, air]

# チェストプレートのパターン
# パターン:
#   行1: [mythril_ingot, air, mythril_ingot]
#   行2: [mythril_ingot, mythril_ingot, mythril_ingot]
#   行3: [mythril_ingot, mythril_ingot, mythril_ingot]

# レギンスのパターン
# パターン:
#   行1: [mythril_ingot, mythril_ingot, mythril_ingot]
#   行2: [mythril_ingot, air, mythril_ingot]
#   行3: [mythril_ingot, air, mythril_ingot]

# ブーツのパターン
# パターン:
#   行1: [air, air, air]
#   行2: [mythril_ingot, air, mythril_ingot]
#   行3: [mythril_ingot, air, mythril_ingot]
```

## 修繕
```yaml
修繕可能: Yes
修繕材料: mythril_ingot
```

## テクスチャ
```yaml
# アイテムテクスチャ
アイテムテクスチャ: mythril_helmet.png

# 装備時テクスチャ（2レイヤー）
防具テクスチャレイヤー1: mythril_layer_1.png  # ヘルメット/チェスト/ブーツ用
防具テクスチャレイヤー2: mythril_layer_2.png  # レギンス用

テクスチャサイズ: 
  - アイテム: 16x16
  - 防具レイヤー: 64x32
```

## 特殊機能（任意）
```yaml
特殊能力: なし
# 例: "水中呼吸効果を付与"
耐火性: No  # 溶岩で燃えないか
```

---

## AIへの指示
```
上記の防具アイテムを実装してください。

必要なファイル:
1. 防具マテリアル定義クラス
2. 防具アイテムクラス（4部位分）
3. アイテム登録
4. アイテムモデルJSON（4部位分）
5. 防具テクスチャ（layer_1.png, layer_2.png）
6. アイテムテクスチャ（4部位分）
7. 言語ファイル（ja_jp.json, en_us.json）
8. クラフトレシピJSON（4部位分）
9. 修繕レシピJSON（鍛冶台用）

プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
```
